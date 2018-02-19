package helloworld.adarsh.com.jobsearch;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import helloworld.adarsh.com.jobsearch.implementor.JoiningDateImpl;
import helloworld.adarsh.com.jobsearch.presenter.JoiningDatePresenter;
import helloworld.adarsh.com.jobsearch.view.JoiningDateView;

public class JoiningDateActivity extends BaseActivity implements JoiningDateView{

    private String desc, id, applicant;
    private JoiningDatePresenter joiningDatePresenter;
    private Date selectedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joining_date);
        getSupportActionBar().setTitle("JOINING DATE");

        joiningDatePresenter = new JoiningDateImpl(this);

        applicant = getIntent().getStringExtra("name");
        id = getIntent().getStringExtra("id");
        desc = getIntent().getStringExtra("desc");

        if(applicant != null) {
            ((TextView) findViewById(R.id.textView)).setText(applicant);
        }
        ((TextView) findViewById(R.id.textView2)).setText(Html.fromHtml(desc));

        findViewById(R.id.imageView1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
                                String date = ""+dayOfMonth+"/"+(monthOfYear+1)+"/"+year;
                                ((TextView) findViewById(R.id.textView4)).setText(date);
                                try{
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // here set the pattern as you date in string was containing like date/month/year
                                    selectedDate = sdf.parse(date);
                                }catch (Exception e){
                                    selectedDate = null;
                                }
                            }
                        },
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.setAccentColor(getResources().getColor(R.color.colorPrimaryDark));
                dpd.show(getFragmentManager(), "Datepickerdialog");
            }
        });

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedDate == null){
                    Toast.makeText(JoiningDateActivity.this, "First select joining date.", Toast.LENGTH_SHORT).show();
                }else{
                    joiningDatePresenter.acceptJobOffer(JoiningDateActivity.this, id, selectedDate.getTime() + "");
                }
            }
        });
    }


    @Override
    public void onJobAccepted() {
        Toast.makeText(this, "Job Accepted Successfully.", Toast.LENGTH_SHORT).show();
        Intent data = new Intent();
        data.putExtra("id", id);
        data.putExtra("job_accepted", true);
        data.putExtra("date", ((TextView) findViewById(R.id.textView4)).getText().toString());
        setResult(RESULT_OK, data);
        onBackPressed();
    }

    @Override
    public void onFailedToAcceptJob() {
        Toast.makeText(this, "Failed to apply for job, try again.", Toast.LENGTH_SHORT).show();
    }


}
