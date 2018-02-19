package helloworld.adarsh.com.jobsearch.implementor;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;

import helloworld.adarsh.com.jobsearch.presenter.JoiningDatePresenter;
import helloworld.adarsh.com.jobsearch.retrofit.ApiClient;
import helloworld.adarsh.com.jobsearch.retrofit.ApiInterface;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobAcceptResponse;
import helloworld.adarsh.com.jobsearch.view.JoiningDateView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Adarsh on 2/13/2018.
 */
public class JoiningDateImpl implements JoiningDatePresenter {

    private JoiningDateView joiningDateView;
    ApiInterface apiService;

    public JoiningDateImpl(JoiningDateView joiningDateView) {
        this.joiningDateView = joiningDateView;
        apiService = ApiClient.getClient().create(ApiInterface.class);
    }

    @Override
    public void acceptJobOffer(Activity activity, String id, String longDate) {
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle("Job Accepting");
        progressDialog.setMessage("Please wait while your offer is being accepted.");
        progressDialog.setCancelable(false);
        progressDialog.show();

        Call<JobAcceptResponse> call = apiService.acceptJob(id, longDate);
        call.enqueue(new Callback<JobAcceptResponse>() {
            @Override
            public void onResponse(Call<JobAcceptResponse> call, Response<JobAcceptResponse> response) {
                progressDialog.dismiss();
                Log.d("Success", (response.body().getData()));
                if(response.body().getStatusMessage().equals("SUCCESS")){
                    joiningDateView.onJobAccepted();
                }
            }

            @Override
            public void onFailure(Call<JobAcceptResponse> call, Throwable t) {
                progressDialog.dismiss();
                joiningDateView.onFailedToAcceptJob();
            }
        });
    }


}