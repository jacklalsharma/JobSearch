package helloworld.adarsh.com.jobsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import helloworld.adarsh.com.jobsearch.adapter.JobOfferAdapter;
import helloworld.adarsh.com.jobsearch.implementor.JobOfferImpl;
import helloworld.adarsh.com.jobsearch.presenter.JobOfferPresenter;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobOfferResponse;
import helloworld.adarsh.com.jobsearch.view.JobOfferView;

public class JobOfferListActivity extends BaseActivity implements JobOfferView{

    private ArrayList<JobOfferResponse> notificationArrayList;
    private JobOfferAdapter adapter;
    private RecyclerView recyclerView;
    private JobOfferPresenter jobOfferPresenter;

    //Get the candidate Id using getIntent() method or prefs.
    private String c_id = "355";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_offer_list);
        getSupportActionBar().setTitle("JOB OFFERS");
        notificationArrayList = new ArrayList<>();

        jobOfferPresenter = new JobOfferImpl(this);
        jobOfferPresenter.getOffersList(this, c_id);

        recyclerView = findViewById(R.id.notification_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == JobOfferImpl.REQUEST_CODE){
            if(resultCode == RESULT_OK){
                if(data.getBooleanExtra("job_rejected", false)){
                    //Job rejected...
                    String id = data.getStringExtra("id");
                    jobOfferPresenter.onJobRejected(id, adapter);
                }else if(data.getBooleanExtra("job_accepted", false)){
                    //Job accepted...
                    String id = data.getStringExtra("id");
                    String date = data.getStringExtra("date");
                    jobOfferPresenter.onJobAccepted(id, adapter, date);
                }
            }
        }
    }

    @Override
    public void onJobOffersGenerated(ArrayList<JobOfferResponse> jobOfferResponses) {
        adapter = new JobOfferAdapter(this, jobOfferResponses, jobOfferPresenter);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onJobOffersNotRecieved() {
        Toast.makeText(this, "No Job Available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onJobOfferSelected() {

    }

    @Override
    public void onSelectedJobResponseAccept() {

    }

    @Override
    public void onSelectedJobResponseReject() {

    }
}
