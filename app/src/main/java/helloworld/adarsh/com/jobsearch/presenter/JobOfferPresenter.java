package helloworld.adarsh.com.jobsearch.presenter;

import android.app.Activity;
import android.content.Context;

import helloworld.adarsh.com.jobsearch.adapter.JobOfferAdapter;

/**
 * Created by Adarsh on 2/11/2018.
 */
public interface JobOfferPresenter {
    void getOffersList(Context context, String c_id);
    void onJobOfferSelected(Activity activity, String interview_id, String description, String expiryDescription, String applicant);
    void onJobRejected(String id, JobOfferAdapter adapter);
    void onJobAccepted(String id, JobOfferAdapter adapter, String date);

}
