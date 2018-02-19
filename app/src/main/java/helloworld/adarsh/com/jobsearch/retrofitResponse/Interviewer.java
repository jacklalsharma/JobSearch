
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Interviewer implements Parcelable
{

    @SerializedName("interviewerID")
    @Expose
    private Integer interviewerID;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("designation")
    @Expose
    private Object designation;
    @SerializedName("username")
    @Expose
    private Object username;
    @SerializedName("password")
    @Expose
    private Object password;
    @SerializedName("notificationID")
    @Expose
    private Object notificationID;
    @SerializedName("quickbloxID")
    @Expose
    private Object quickbloxID;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("client")
    @Expose
    private Client client;
    public final static Creator<Interviewer> CREATOR = new Creator<Interviewer>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Interviewer createFromParcel(Parcel in) {
            return new Interviewer(in);
        }

        public Interviewer[] newArray(int size) {
            return (new Interviewer[size]);
        }

    }
    ;

    protected Interviewer(Parcel in) {
        this.interviewerID = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.designation = ((Object) in.readValue((Object.class.getClassLoader())));
        this.username = ((Object) in.readValue((Object.class.getClassLoader())));
        this.password = ((Object) in.readValue((Object.class.getClassLoader())));
        this.notificationID = ((Object) in.readValue((Object.class.getClassLoader())));
        this.quickbloxID = ((Object) in.readValue((Object.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.client = ((Client) in.readValue((Client.class.getClassLoader())));
    }

    public Interviewer() {
    }

    public Integer getInterviewerID() {
        return interviewerID;
    }

    public void setInterviewerID(Integer interviewerID) {
        this.interviewerID = interviewerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDesignation() {
        return designation;
    }

    public void setDesignation(Object designation) {
        this.designation = designation;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(Object notificationID) {
        this.notificationID = notificationID;
    }

    public Object getQuickbloxID() {
        return quickbloxID;
    }

    public void setQuickbloxID(Object quickbloxID) {
        this.quickbloxID = quickbloxID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(interviewerID);
        dest.writeValue(name);
        dest.writeValue(designation);
        dest.writeValue(username);
        dest.writeValue(password);
        dest.writeValue(notificationID);
        dest.writeValue(quickbloxID);
        dest.writeValue(status);
        dest.writeValue(client);
    }

    public int describeContents() {
        return  0;
    }

}
