package helloworld.adarsh.com.jobsearch.implementor;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;

import helloworld.adarsh.com.jobsearch.JoiningDateActivity;
import helloworld.adarsh.com.jobsearch.presenter.JobDetailsPresenter;
import helloworld.adarsh.com.jobsearch.retrofit.ApiClient;
import helloworld.adarsh.com.jobsearch.retrofit.ApiInterface;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobRejectResponse;
import helloworld.adarsh.com.jobsearch.view.JobDetailsView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Adarsh on 2/12/2018.
 */
public class JobDetailsImpl implements JobDetailsPresenter{

    private JobDetailsView jobDetailsView;
    private ApiInterface apiInterface;
    public static int REQUEST_CODE = 1;

    public JobDetailsImpl(JobDetailsView jobDetailsView) {
        this.jobDetailsView = jobDetailsView;
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
    }

    @Override
    public void onJobAccepted(Activity activity, String interview_id, String desc, String applicant) {
        Intent intent = new Intent(activity, JoiningDateActivity.class);
        intent.putExtra("id", interview_id);
        intent.putExtra("desc", desc);
        intent.putExtra("name", applicant);
        activity.startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public void onJobRejected(Activity activity, String interview_id) {
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle("Job Rejecting");
        progressDialog.setMessage("Please wait while your offer is being rejected.");
        progressDialog.setCancelable(false);
        progressDialog.show();

        Call<JobRejectResponse> call = apiInterface.rejectJob(interview_id);
        call.enqueue(new Callback<JobRejectResponse>() {
            @Override
            public void onResponse(Call<JobRejectResponse> call, Response<JobRejectResponse> response) {
                if(response.body() != null){
                    jobDetailsView.onJobRejected();
                    progressDialog.dismiss();
                }else{
                    jobDetailsView.onFailedToRejectJob();
                }
            }

            @Override
            public void onFailure(Call<JobRejectResponse> call, Throwable t) {
                jobDetailsView.onFailedToRejectJob();
            }
        });
    }
}
