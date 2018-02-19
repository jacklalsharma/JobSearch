package helloworld.adarsh.com.jobsearch.view;

import java.util.List;

import helloworld.adarsh.com.jobsearch.retrofitResponse.PsychoTestResponse;

/**
 * Created by Adarsh on 2/10/2018.
 */

public interface PsychometricTestView {
    void onPsychometricQuestionsReceived(List<PsychoTestResponse> psychoTestResponseList);
    void onPsychometricQuestionsNotReceived(String error);
    void onAnswersSubmitted();
    void onAnswerSubmissionFailed(String data);
    void onQuestionsNotAnswered();
}
