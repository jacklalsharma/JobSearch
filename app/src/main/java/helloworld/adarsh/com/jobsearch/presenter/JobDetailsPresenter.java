package helloworld.adarsh.com.jobsearch.presenter;

import android.app.Activity;

/**
 * Created by Adarsh on 2/12/2018.
 */
public interface JobDetailsPresenter {
    void onJobAccepted(Activity activity, String interview_id, String desc, String applicant);
    void onJobRejected(Activity activity, String interview_id);
}
