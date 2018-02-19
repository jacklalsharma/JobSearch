package helloworld.adarsh.com.jobsearch.view;

import helloworld.adarsh.com.jobsearch.retrofitResponse.ChangedPasswordResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ForgotPasswordResponse;

/**
 * Created by Adarsh on 2/10/2018.
 */
public interface ForgotPasswordView {
    void onPasswordChangeRequestSuccessful(ForgotPasswordResponse forgotPasswordResponse);
    void onPasswordChangeRequestFailed(Throwable t);
    void onPasswordChanged(ChangedPasswordResponse changedPasswordResponse);
    void onPasswordChangeFailed(String error);
    void onPasswordMismatched(String message);
}
