package helloworld.adarsh.com.jobsearch.presenter;

import android.content.Context;
import android.widget.EditText;

/**
 * Created by Adarsh on 2/10/2018.
 */
public interface ForgotPasswordPresenter {
    void requestPasswordChange(Context context, String emailID);
    void changePassword(Context context, EditText newPassword, EditText confirmPassword, String c_id);
}
