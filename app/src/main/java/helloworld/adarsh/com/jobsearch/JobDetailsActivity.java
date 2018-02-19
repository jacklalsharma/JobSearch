package helloworld.adarsh.com.jobsearch;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import helloworld.adarsh.com.jobsearch.implementor.JobDetailsImpl;
import helloworld.adarsh.com.jobsearch.presenter.JobDetailsPresenter;
import helloworld.adarsh.com.jobsearch.view.JobDetailsView;

public class JobDetailsActivity extends BaseActivity implements JobDetailsView{

    private JobDetailsPresenter jobDetailsPresenter;
    private String desc, expDesc, id, applicant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job__notification_detail);
        getSupportActionBar().setTitle("JOB OFFER DETAIL");

        id = getIntent().getStringExtra("id");
        desc = getIntent().getStringExtra("desc");
        expDesc = getIntent().getStringExtra("note");
        applicant = getIntent().getStringExtra("name");

        if(applicant != null) {
            ((TextView) findViewById(R.id.textView)).setText(applicant);
        }
        ((TextView) findViewById(R.id.textView3)).setText(expDesc);
        ((TextView) findViewById(R.id.textView2)).setText(Html.fromHtml(desc));

        jobDetailsPresenter = new JobDetailsImpl(this);
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jobDetailsPresenter.onJobAccepted(JobDetailsActivity.this, id, desc, applicant);
            }
        });

        findViewById(R.id.textView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jobDetailsPresenter.onJobRejected(JobDetailsActivity.this, id);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == JobDetailsImpl.REQUEST_CODE){
            if(resultCode == RESULT_OK){
                setResult(RESULT_OK, data);
                onBackPressed();
            }
        }
    }

    @Override
    public void onFailedToRejectJob() {
        Toast.makeText(this, "Failed to reject job, try again later", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onJobRejected() {
        Toast.makeText(this, "Job rejected successfully.", Toast.LENGTH_SHORT).show();
        Intent data = new Intent();
        data.putExtra("id", id);
        data.putExtra("job_rejected", true);
        setResult(RESULT_OK, data);
        onBackPressed();
    }
}
