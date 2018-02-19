package helloworld.adarsh.com.jobsearch.implementor;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import helloworld.adarsh.com.jobsearch.ForgotPasswordActivity;
import helloworld.adarsh.com.jobsearch.presenter.ForgotPasswordPresenter;
import helloworld.adarsh.com.jobsearch.retrofit.ApiClient;
import helloworld.adarsh.com.jobsearch.retrofit.ApiInterface;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ChangedPasswordResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ForgotPasswordResponse;
import helloworld.adarsh.com.jobsearch.view.ForgotPasswordView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Adarsh on 2/10/2018.
 */
public class ForgotPasswordImpl implements ForgotPasswordPresenter{

    private ForgotPasswordView forgotPasswordView;
    private ApiInterface apiService;
    private ForgotPasswordResponse forgotPasswordResponse;

    public ForgotPasswordImpl(ForgotPasswordView forgotPasswordView) {
        this.forgotPasswordView = forgotPasswordView;
        apiService = ApiClient.getClient().create(ApiInterface.class);
    }

    @Override
    public void requestPasswordChange(Context context, String emailID) {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Password Reset");
        progressDialog.setMessage("Please wait while requesting for password reset");
        progressDialog.setCancelable(false);
        progressDialog.show();

        Call<ForgotPasswordResponse> call = apiService.getForgotPasswordResponseCall(emailID);
        call.enqueue(new Callback<ForgotPasswordResponse>() {
            @Override
            public void onResponse(Call<ForgotPasswordResponse> call, Response<ForgotPasswordResponse> response) {
                progressDialog.dismiss();
                forgotPasswordResponse = response.body();
                forgotPasswordView.onPasswordChangeRequestSuccessful(response.body());
            }

            @Override
            public void onFailure(Call<ForgotPasswordResponse> call, Throwable t) {
                progressDialog.dismiss();
                forgotPasswordView.onPasswordChangeRequestFailed(t);
            }
        });

    }

    @Override
    public void changePassword(Context context, EditText newPassword, EditText confirmPassword, String c_id) {
        if(newPassword.getText().toString().length() == 0 || confirmPassword.getText().toString().length() == 0){
            forgotPasswordView.onPasswordMismatched("Password can't be Empty");
            return;
        }

        if(newPassword.getText().toString().equals(confirmPassword.getText().toString())){
            changePassword(context, newPassword.getText().toString(), c_id);
            return;
        }

        forgotPasswordView.onPasswordMismatched("Password Mismatch");
    }

    /**
     * This method is to change the password by calling
     * @param context
     * @param newPassword
     */
    private void changePassword(Context context, String newPassword, String c_id){
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Changing Password");
        progressDialog.setMessage("Please wait while resetting Password");
        progressDialog.show();

        Call<ChangedPasswordResponse> call = apiService.getPasswordResetCall(c_id, newPassword);
        call.enqueue(new Callback<ChangedPasswordResponse>() {
            @Override
            public void onResponse(Call<ChangedPasswordResponse> call, Response<ChangedPasswordResponse> response) {
                if(response.body().getStatusMessage().equals("SUCCESS")) {
                    Log.d("RESPONSE", response.body().toString());
                    forgotPasswordView.onPasswordChanged(response.body());

                }else{
                    forgotPasswordView.onPasswordChangeFailed("Failed to change password, try later");
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ChangedPasswordResponse> call, Throwable t) {
               progressDialog.dismiss();
               forgotPasswordView.onPasswordChangeFailed("Failed to change password, try later");
            }
        });
    }
}
