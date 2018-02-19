package helloworld.adarsh.com.jobsearch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LaunchActivity extends AppCompatActivity {

    private  Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Forgot Password");
        arrayList.add("Job Offer List");
        arrayList.add("Psychometric Test");
        ArrayAdapter arrayAdapter = new ArrayAdapter(LaunchActivity.this,android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent = new Intent(LaunchActivity.this, ForgotPasswordActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(LaunchActivity.this, JobOfferListActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(LaunchActivity.this, PsychometricTestActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
