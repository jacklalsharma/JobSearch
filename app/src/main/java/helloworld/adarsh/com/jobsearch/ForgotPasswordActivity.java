package helloworld.adarsh.com.jobsearch;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import helloworld.adarsh.com.jobsearch.implementor.ForgotPasswordImpl;
import helloworld.adarsh.com.jobsearch.presenter.ForgotPasswordPresenter;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ChangedPasswordResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ForgotPasswordResponse;
import helloworld.adarsh.com.jobsearch.view.ForgotPasswordView;

/**
 * Created by Adarsh on 2/10/2018.
 */
public class ForgotPasswordActivity extends BaseActivity implements ForgotPasswordView{

    private final static String emailID = "ramya@mail.com";
    private String c_id = "355";
    private EditText newPassword;
    private EditText confirmPassword;

    private ForgotPasswordPresenter forgotPasswordPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getSupportActionBar().setTitle("FORGOT PASSWORD");

        newPassword = (EditText) findViewById(R.id.newPasswordEditText);
        confirmPassword = (EditText) findViewById(R.id.confirmationEditText);
        forgotPasswordPresenter = new ForgotPasswordImpl(this);
        forgotPasswordPresenter.requestPasswordChange(this, emailID);


        findViewById(R.id.changePasswordbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotPasswordPresenter.changePassword(ForgotPasswordActivity.this, newPassword, confirmPassword, c_id);
            }
        });
    }


    @Override
    public void onPasswordChangeRequestSuccessful(ForgotPasswordResponse forgotPasswordResponse) {
        Toast.makeText(ForgotPasswordActivity.this, "Successful requested for password change", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPasswordChangeRequestFailed(Throwable t) {
        Toast.makeText(ForgotPasswordActivity.this, "Failed to request for password change", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPasswordChanged(ChangedPasswordResponse changedPasswordResponse) {
        //Upon password change...
        if(changedPasswordResponse.getStatusMessage().equals("SUCCESS")) {
            Toast.makeText(ForgotPasswordActivity.this, "Successful changed password", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(ForgotPasswordActivity.this, "Failed to changed the password", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onPasswordChangeFailed(String error) {
        Toast.makeText(ForgotPasswordActivity.this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPasswordMismatched(String message) {
        Toast.makeText(ForgotPasswordActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
