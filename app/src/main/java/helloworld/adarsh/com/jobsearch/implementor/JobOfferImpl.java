package helloworld.adarsh.com.jobsearch.implementor;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import helloworld.adarsh.com.jobsearch.JobDetailsActivity;
import helloworld.adarsh.com.jobsearch.adapter.JobOfferAdapter;
import helloworld.adarsh.com.jobsearch.presenter.JobOfferPresenter;
import helloworld.adarsh.com.jobsearch.retrofit.ApiClient;
import helloworld.adarsh.com.jobsearch.retrofit.ApiInterface;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobOfferResponse;
import helloworld.adarsh.com.jobsearch.view.JobOfferView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Adarsh on 2/11/2018.
 */
public class JobOfferImpl implements JobOfferPresenter {

    private JobOfferView jobOfferView;
    private ApiInterface apiService;
    public static int REQUEST_CODE = 1;
    private ArrayList<JobOfferResponse> jobOfferResponses;

    public JobOfferImpl(JobOfferView jobOfferView) {
        this.jobOfferView = jobOfferView;
        apiService = ApiClient.getClient().create(ApiInterface.class);
    }

    @Override
    public void getOffersList(Context context, String c_id) {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Job Offers");
        progressDialog.setMessage("Please wait while fetching offers");
        progressDialog.setCancelable(false);
        progressDialog.show();

        Call<List<JobOfferResponse>> call = apiService.getJobOffers(c_id);
        call.enqueue(new Callback<List<JobOfferResponse>>() {
            @Override
            public void onResponse(Call<List<JobOfferResponse>> call, Response<List<JobOfferResponse>> response) {
                progressDialog.dismiss();
                if(response.body() != null) {
                    Log.d("RESPONSE", response.body().toString());
                    jobOfferResponses = new ArrayList<>(response.body());
                    jobOfferView.onJobOffersGenerated(jobOfferResponses);
                } else{
                    jobOfferView.onJobOffersNotRecieved();
                }
            }

            @Override
            public void onFailure(Call<List<JobOfferResponse>> call, Throwable t) {
                jobOfferView.onJobOffersNotRecieved();
                Log.d("ERROR2", t.toString());
                progressDialog.dismiss();
            }
        });

    }

    @Override
    public void onJobOfferSelected(Activity activity, String interview_id, String description, String expiryDescription, String applicant){
        Intent intent = new Intent(activity, JobDetailsActivity.class);
        intent.putExtra("id", interview_id);
        intent.putExtra("desc", description);
        intent.putExtra("note", expiryDescription);
        intent.putExtra("name", applicant);
        activity.startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public void onJobRejected(String id, JobOfferAdapter adapter) {
        if(jobOfferResponses == null){
            return;
        }

        for(int i = 0 ;i < jobOfferResponses.size() ; ++i){
            if((jobOfferResponses.get(i).getScheduleInterviewID() + "").equals(id)){
                jobOfferResponses.remove(i);
                adapter.notifyDataSetChanged();
                break;
            }
        }

    }

    @Override
    public void onJobAccepted(String id, JobOfferAdapter adapter, String date) {
        if (jobOfferResponses == null) {
            return;
        }
        for (int i = 0; i < jobOfferResponses.size(); ++i){
            if ((jobOfferResponses.get(i).getScheduleInterviewID() + "").equals(id)){
                jobOfferResponses.get(i).setJobAccepted(true);
                jobOfferResponses.get(i).setAcceptedJobJoiningDate(date);
                adapter.notifyItemChanged(i);
                break;
            }
        }
    }

}
