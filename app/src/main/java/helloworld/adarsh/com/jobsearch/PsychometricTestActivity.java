package helloworld.adarsh.com.jobsearch;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import helloworld.adarsh.com.jobsearch.adapter.TestAdapter;
import helloworld.adarsh.com.jobsearch.implementor.PsychometricTestImpl;
import helloworld.adarsh.com.jobsearch.presenter.PsychometricTestPresenter;
import helloworld.adarsh.com.jobsearch.retrofitResponse.PsychoTestResponse;
import helloworld.adarsh.com.jobsearch.view.PsychometricTestView;

public class PsychometricTestActivity extends BaseActivity implements PsychometricTestView{

    private RecyclerView recyclerView;
    private PsychometricTestPresenter psychometricTestPresenter;

    //Get the candidate Id using getIntent() method or prefs.
    private String cId = "273";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychometric_test);
        getSupportActionBar().setTitle("PSYCHOMETRIC TEST");


        psychometricTestPresenter = new PsychometricTestImpl(this);
        recyclerView = findViewById(R.id.test_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        psychometricTestPresenter.getPsychometricQuestions(this);
        findViewById(R.id.submit_answer_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                psychometricTestPresenter.submitPsychometricAnswers(PsychometricTestActivity.this, cId);
            }
        });
    }


    @Override
    public void onPsychometricQuestionsReceived(List<PsychoTestResponse> psychoTestResponseList) {
        TestAdapter adapter = new TestAdapter(PsychometricTestActivity.this, new ArrayList<>(psychoTestResponseList));
        recyclerView.setAdapter(adapter);
        findViewById(R.id.submit_answer_btn).setVisibility(View.VISIBLE);



    }

    @Override
    public void onPsychometricQuestionsNotReceived(String error) {
        Toast.makeText(PsychometricTestActivity.this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAnswersSubmitted() {
        Toast.makeText(PsychometricTestActivity.this, "Answers submitted.", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAnswerSubmissionFailed(String data) {
        Toast.makeText(PsychometricTestActivity.this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onQuestionsNotAnswered() {
        Toast.makeText(PsychometricTestActivity.this, "Please answer all questions.", Toast.LENGTH_SHORT).show();

    }
}
