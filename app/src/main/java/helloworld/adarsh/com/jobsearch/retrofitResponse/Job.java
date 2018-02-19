
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Job implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("openingTitle")
    @Expose
    private String openingTitle;
    @SerializedName("maxYearOfExperience")
    @Expose
    private Integer maxYearOfExperience;
    @SerializedName("minYearOfExperience")
    @Expose
    private Integer minYearOfExperience;
    @SerializedName("organizationName")
    @Expose
    private String organizationName;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("createdDate")
    @Expose
    private Long createdDate;
    @SerializedName("positions")
    @Expose
    private Integer positions;
    public final static Creator<Job> CREATOR = new Creator<Job>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Job createFromParcel(Parcel in) {
            return new Job(in);
        }

        public Job[] newArray(int size) {
            return (new Job[size]);
        }

    }
    ;

    protected Job(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.openingTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.maxYearOfExperience = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.minYearOfExperience = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.organizationName = ((String) in.readValue((String.class.getClassLoader())));
        this.location = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.createdDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.positions = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Job() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpeningTitle() {
        return openingTitle;
    }

    public void setOpeningTitle(String openingTitle) {
        this.openingTitle = openingTitle;
    }

    public Integer getMaxYearOfExperience() {
        return maxYearOfExperience;
    }

    public void setMaxYearOfExperience(Integer maxYearOfExperience) {
        this.maxYearOfExperience = maxYearOfExperience;
    }

    public Integer getMinYearOfExperience() {
        return minYearOfExperience;
    }

    public void setMinYearOfExperience(Integer minYearOfExperience) {
        this.minYearOfExperience = minYearOfExperience;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getPositions() {
        return positions;
    }

    public void setPositions(Integer positions) {
        this.positions = positions;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(openingTitle);
        dest.writeValue(maxYearOfExperience);
        dest.writeValue(minYearOfExperience);
        dest.writeValue(organizationName);
        dest.writeValue(location);
        dest.writeValue(status);
        dest.writeValue(createdDate);
        dest.writeValue(positions);
    }

    public int describeContents() {
        return  0;
    }

}
