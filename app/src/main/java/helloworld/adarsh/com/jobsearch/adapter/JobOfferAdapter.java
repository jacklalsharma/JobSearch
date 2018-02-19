package helloworld.adarsh.com.jobsearch.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import helloworld.adarsh.com.jobsearch.R;
import helloworld.adarsh.com.jobsearch.presenter.JobOfferPresenter;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobOfferResponse;

/**
 * Created by Adarsh on 2/6/2018.
 */
public class JobOfferAdapter extends RecyclerView.Adapter<JobOfferAdapter.NotificationViewHolder>{

    private JobOfferPresenter jobOfferPresenter;
    private Activity activity;
    private ArrayList<JobOfferResponse> notificationArrayList;
    private String description = "You have been selected to join %s as %s. Please submit your joining date.";
    private String expiryDescription = "Please Note: Job offer expires on %s. Please respond on or before expiry date";

    public static String salary;
    public static String desc;

    public JobOfferAdapter(Activity activity, ArrayList<JobOfferResponse> notificationArrayList, JobOfferPresenter jobOfferPresenter) {
        this.activity = activity;
        this.notificationArrayList = notificationArrayList;
        this.jobOfferPresenter = jobOfferPresenter;
    }

    @Override
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list_item_notification, parent, false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationViewHolder holder, final int position) {
        final JobOfferResponse notification = notificationArrayList.get(position);

        final String applicant = "Congratulations!! " + notification.getCandidate().getFirstName() + " " + notification.getCandidate().getLastName();

        desc = String.format(description, "<font color=#576AAD>" +  notification.getJob().getOrganizationName() + "</font>",
                "<b><font color=black>" +  notification.getJob().getOpeningTitle() + "</font></b>");
        final String expDate = String.format(expiryDescription, new SimpleDateFormat("EEEE, MMMM d, yyyy").format(new Date(notification.getOfferExpiredOn())));

        if(notificationArrayList.get(position).isJobAccepted()){
            desc = String.format("You have been selected to join %s as %s.", "<b><font color=black>" +  notification.getJob().getOrganizationName() + "</font></b>",
                    "<b><font color=black>" +  notification.getJob().getOpeningTitle() + "</font></b>") + " Your joining date is " + "<b><font color=black>" + notificationArrayList.get(position).getAcceptedJobJoiningDate() + "</b></font color=black>";
        }

        if(notification.getJob().getCreatedDate() == null ){
            holder.time.setVisibility(View.INVISIBLE);
        }else{
            holder.time.setVisibility(View.VISIBLE);
            holder.time.setText(getTimePassed(notification.getJob().getCreatedDate()));
        }
        holder.desc.setText(Html.fromHtml(desc));
        holder.main.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(notificationArrayList.get(position).isJobAccepted()){
                    Toast.makeText(activity, "Already accepted this job", Toast.LENGTH_SHORT).show();
                    return;
                }

                desc = String.format("You have been selected to join %s as %s.", "<b><font color=black>" +  notification.getJob().getOrganizationName() + "</font></b>",
                        "<b><font color=black>" +  notification.getJob().getOpeningTitle() + "</font></b>");

                salary = "Your annual salary is ₹" + "<b><font color=black>" +  notification.getOfferedCTC() + "</font></b>" + " Lacs";

                jobOfferPresenter.onJobOfferSelected(activity, notification.getScheduleInterviewID() + "",
                        desc + salary, expDate, applicant);


            }
        });
    }

    @Override
    public int getItemCount() {
        return notificationArrayList.size();
    }

    class NotificationViewHolder extends RecyclerView.ViewHolder{
        TextView desc, time;
        View main;
        public NotificationViewHolder(View itemView) {
            super(itemView);
            desc = (TextView) itemView.findViewById(R.id.description);
            time = (TextView) itemView.findViewById(R.id.time);
            main = itemView.findViewById(R.id.main_layout);
        }
    }

    private String getTimePassed(long createdAt){
        String time = "";
        long diff = System.currentTimeMillis() - createdAt;

        //Converting into seconds.
        diff = diff/1000;

        //Into Minutes.
        diff = diff/60;

        //Into hours
        diff = diff/60;

        time = diff + " hours ago";

        //Into Days
        if(diff > 24){
            diff = diff/24;
            if(diff > 1) {
                time = diff + " days ago";
            }else{
                time = diff + " day ago";
            }
        }
        return time;
    }

}
