
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CandidateWorkLog implements Parcelable
{

    @SerializedName("candidateWorkLogID")
    @Expose
    private Integer candidateWorkLogID;
    @SerializedName("organizationName")
    @Expose
    private String organizationName;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("cityOrTown")
    @Expose
    private String cityOrTown;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("startDate")
    @Expose
    private Long startDate;
    @SerializedName("endDate")
    @Expose
    private Long endDate;
    @SerializedName("currentlyWork")
    @Expose
    private Boolean currentlyWork;
    public final static Creator<CandidateWorkLog> CREATOR = new Creator<CandidateWorkLog>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CandidateWorkLog createFromParcel(Parcel in) {
            return new CandidateWorkLog(in);
        }

        public CandidateWorkLog[] newArray(int size) {
            return (new CandidateWorkLog[size]);
        }

    }
    ;

    protected CandidateWorkLog(Parcel in) {
        this.candidateWorkLogID = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.organizationName = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.cityOrTown = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((Object) in.readValue((Object.class.getClassLoader())));
        this.startDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.endDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.currentlyWork = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public CandidateWorkLog() {
    }

    public Integer getCandidateWorkLogID() {
        return candidateWorkLogID;
    }

    public void setCandidateWorkLogID(Integer candidateWorkLogID) {
        this.candidateWorkLogID = candidateWorkLogID;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public Boolean getCurrentlyWork() {
        return currentlyWork;
    }

    public void setCurrentlyWork(Boolean currentlyWork) {
        this.currentlyWork = currentlyWork;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(candidateWorkLogID);
        dest.writeValue(organizationName);
        dest.writeValue(description);
        dest.writeValue(cityOrTown);
        dest.writeValue(country);
        dest.writeValue(startDate);
        dest.writeValue(endDate);
        dest.writeValue(currentlyWork);
    }

    public int describeContents() {
        return  0;
    }

}
