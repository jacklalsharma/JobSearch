
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobOfferResponse implements Parcelable {

    private boolean isJobAccepted;

    private String acceptedJobJoiningDate;

    @SerializedName("scheduleInterviewID")
    @Expose
    private Long scheduleInterviewID;
    @SerializedName("interviewType")
    @Expose
    private String interviewType;
    @SerializedName("interviewDateAndTime")
    @Expose
    private Long interviewDateAndTime;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("scheduledBy")
    @Expose
    private Integer scheduledBy;
    @SerializedName("accepted")
    @Expose
    private Boolean accepted;
    @SerializedName("selected")
    @Expose
    private Integer selected;
    @SerializedName("selectedDate")
    @Expose
    private Long selectedDate;
    @SerializedName("joiningDate")
    @Expose
    private Long joiningDate;
    @SerializedName("interviewStatus")
    @Expose
    private Integer interviewStatus;
    @SerializedName("joiningConfirmation")
    @Expose
    private Integer joiningConfirmation;
    @SerializedName("joined")
    @Expose
    private Integer joined;
    @SerializedName("offeredCTC")
    @Expose
    private String offeredCTC;
    @SerializedName("offerExpiredOn")
    @Expose
    private Long offerExpiredOn;
    @SerializedName("offerExpired")
    @Expose
    private Boolean offerExpired;
    @SerializedName("candidate")
    @Expose
    private Candidate candidate;
    @SerializedName("job")
    @Expose
    private Job job;
    @SerializedName("interviewer")
    @Expose
    private Interviewer interviewer;
    @SerializedName("client")
    @Expose
    private Client_ client;
    public final static Creator<JobOfferResponse> CREATOR = new Creator<JobOfferResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public JobOfferResponse createFromParcel(Parcel in) {
            return new JobOfferResponse(in);
        }

        public JobOfferResponse[] newArray(int size) {
            return (new JobOfferResponse[size]);
        }

    }
    ;

    protected JobOfferResponse(Parcel in) {
        this.scheduleInterviewID = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.interviewType = ((String) in.readValue((String.class.getClassLoader())));
        this.interviewDateAndTime = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.scheduledBy = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.accepted = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.selected = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.selectedDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.joiningDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.interviewStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.joiningConfirmation = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.joined = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.offeredCTC = ((String) in.readValue((String.class.getClassLoader())));
        this.offerExpiredOn = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.offerExpired = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.candidate = ((Candidate) in.readValue((Candidate.class.getClassLoader())));
        this.job = ((Job) in.readValue((Job.class.getClassLoader())));
        this.interviewer = ((Interviewer) in.readValue((Interviewer.class.getClassLoader())));
        this.client = ((Client_) in.readValue((Client_.class.getClassLoader())));
    }

    public JobOfferResponse() {
    }

    public Long getScheduleInterviewID() {
        return scheduleInterviewID;
    }

    public void setScheduleInterviewID(Long scheduleInterviewID) {
        this.scheduleInterviewID = scheduleInterviewID;
    }

    public String getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(String interviewType) {
        this.interviewType = interviewType;
    }

    public Long getInterviewDateAndTime() {
        return interviewDateAndTime;
    }

    public void setInterviewDateAndTime(Long interviewDateAndTime) {
        this.interviewDateAndTime = interviewDateAndTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getScheduledBy() {
        return scheduledBy;
    }

    public void setScheduledBy(Integer scheduledBy) {
        this.scheduledBy = scheduledBy;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
    }

    public Long getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Long selectedDate) {
        this.selectedDate = selectedDate;
    }

    public Long getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Long joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Integer getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public Integer getJoiningConfirmation() {
        return joiningConfirmation;
    }

    public void setJoiningConfirmation(Integer joiningConfirmation) {
        this.joiningConfirmation = joiningConfirmation;
    }

    public Integer getJoined() {
        return joined;
    }

    public void setJoined(Integer joined) {
        this.joined = joined;
    }

    public String getOfferedCTC() {
        return offeredCTC;
    }

    public void setOfferedCTC(String offeredCTC) {
        this.offeredCTC = offeredCTC;
    }

    public Long getOfferExpiredOn() {
        return offerExpiredOn;
    }

    public void setOfferExpiredOn(Long offerExpiredOn) {
        this.offerExpiredOn = offerExpiredOn;
    }

    public Boolean getOfferExpired() {
        return offerExpired;
    }

    public void setOfferExpired(Boolean offerExpired) {
        this.offerExpired = offerExpired;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public Client_ getClient() {
        return client;
    }

    public void setClient(Client_ client) {
        this.client = client;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(scheduleInterviewID);
        dest.writeValue(interviewType);
        dest.writeValue(interviewDateAndTime);
        dest.writeValue(location);
        dest.writeValue(scheduledBy);
        dest.writeValue(accepted);
        dest.writeValue(selected);
        dest.writeValue(selectedDate);
        dest.writeValue(joiningDate);
        dest.writeValue(interviewStatus);
        dest.writeValue(joiningConfirmation);
        dest.writeValue(joined);
        dest.writeValue(offeredCTC);
        dest.writeValue(offerExpiredOn);
        dest.writeValue(offerExpired);
        dest.writeValue(candidate);
        dest.writeValue(job);
        dest.writeValue(interviewer);
        dest.writeValue(client);
    }

    public int describeContents() {
        return  0;
    }

    public boolean isJobAccepted() {
        return isJobAccepted;
    }

    public void setJobAccepted(boolean jobAccepted) {
        isJobAccepted = jobAccepted;
    }

    public String getAcceptedJobJoiningDate() {
        return acceptedJobJoiningDate;
    }

    public void setAcceptedJobJoiningDate(String acceptedJobJoiningDate) {
        this.acceptedJobJoiningDate = acceptedJobJoiningDate;
    }
}
