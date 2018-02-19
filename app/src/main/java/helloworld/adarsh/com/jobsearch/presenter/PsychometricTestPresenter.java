package helloworld.adarsh.com.jobsearch.presenter;

import android.content.Context;

/**
 * Created by Adarsh on 2/10/2018.
 */
public interface PsychometricTestPresenter {
    void getPsychometricQuestions(Context context);
    void submitPsychometricAnswers(Context context, String cId);
}
