
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Candidate implements Parcelable
{

    @SerializedName("candidateID")
    @Expose
    private Integer candidateID;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("emailID")
    @Expose
    private String emailID;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("candidatePhotoURL")
    @Expose
    private Object candidatePhotoURL;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("candidateDOB")
    @Expose
    private Long candidateDOB;
    @SerializedName("candidateType")
    @Expose
    private Object candidateType;
    @SerializedName("referaredCompanyID")
    @Expose
    private Object referaredCompanyID;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zipCode")
    @Expose
    private Object zipCode;
    @SerializedName("createdDate")
    @Expose
    private Long createdDate;
    @SerializedName("updateDate")
    @Expose
    private Long updateDate;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("yearsOfExperienceInMonths")
    @Expose
    private Double yearsOfExperienceInMonths;
    @SerializedName("currentCTC")
    @Expose
    private String currentCTC;
    @SerializedName("expectedCTC")
    @Expose
    private String expectedCTC;
    @SerializedName("noticePeriod")
    @Expose
    private String noticePeriod;
    @SerializedName("noOfCompaniesWorked")
    @Expose
    private Object noOfCompaniesWorked;
    @SerializedName("quickbloxID")
    @Expose
    private String quickbloxID;
    @SerializedName("notificationID")
    @Expose
    private Object notificationID;
    @SerializedName("candidateWorkLogs")
    @Expose
    private List<CandidateWorkLog> candidateWorkLogs = null;
    @SerializedName("psychometricTest")
    @Expose
    private Object psychometricTest;
    public final static Creator<Candidate> CREATOR = new Creator<Candidate>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Candidate createFromParcel(Parcel in) {
            return new Candidate(in);
        }

        public Candidate[] newArray(int size) {
            return (new Candidate[size]);
        }

    }
    ;

    protected Candidate(Parcel in) {
        this.candidateID = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.firstName = ((String) in.readValue((String.class.getClassLoader())));
        this.lastName = ((String) in.readValue((String.class.getClassLoader())));
        this.emailID = ((String) in.readValue((String.class.getClassLoader())));
        this.phoneNumber = ((String) in.readValue((String.class.getClassLoader())));
        this.candidatePhotoURL = ((Object) in.readValue((Object.class.getClassLoader())));
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.candidateDOB = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.candidateType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.referaredCompanyID = ((Object) in.readValue((Object.class.getClassLoader())));
        this.address = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.zipCode = ((Object) in.readValue((Object.class.getClassLoader())));
        this.createdDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.updateDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.designation = ((String) in.readValue((String.class.getClassLoader())));
        this.domain = ((String) in.readValue((String.class.getClassLoader())));
        this.yearsOfExperienceInMonths = ((Double) in.readValue((Double.class.getClassLoader())));
        this.currentCTC = ((String) in.readValue((String.class.getClassLoader())));
        this.expectedCTC = ((String) in.readValue((String.class.getClassLoader())));
        this.noticePeriod = ((String) in.readValue((String.class.getClassLoader())));
        this.noOfCompaniesWorked = ((Object) in.readValue((Object.class.getClassLoader())));
        this.quickbloxID = ((String) in.readValue((String.class.getClassLoader())));
        this.notificationID = ((Object) in.readValue((Object.class.getClassLoader())));
        //in.readList(this.candidateWorkLogs, (helloworld.adarsh.com.jobsearch.retrofitResponse.CandidateWorkLog.class.getClassLoader()));
        this.psychometricTest = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Candidate() {
    }

    public Integer getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(Integer candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object getCandidatePhotoURL() {
        return candidatePhotoURL;
    }

    public void setCandidatePhotoURL(Object candidatePhotoURL) {
        this.candidatePhotoURL = candidatePhotoURL;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getCandidateDOB() {
        return candidateDOB;
    }

    public void setCandidateDOB(Long candidateDOB) {
        this.candidateDOB = candidateDOB;
    }

    public Object getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(Object candidateType) {
        this.candidateType = candidateType;
    }

    public Object getReferaredCompanyID() {
        return referaredCompanyID;
    }

    public void setReferaredCompanyID(Object referaredCompanyID) {
        this.referaredCompanyID = referaredCompanyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Object getZipCode() {
        return zipCode;
    }

    public void setZipCode(Object zipCode) {
        this.zipCode = zipCode;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Long updateDate) {
        this.updateDate = updateDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Double getYearsOfExperienceInMonths() {
        return yearsOfExperienceInMonths;
    }

    public void setYearsOfExperienceInMonths(Double yearsOfExperienceInMonths) {
        this.yearsOfExperienceInMonths = yearsOfExperienceInMonths;
    }

    public String getCurrentCTC() {
        return currentCTC;
    }

    public void setCurrentCTC(String currentCTC) {
        this.currentCTC = currentCTC;
    }

    public String getExpectedCTC() {
        return expectedCTC;
    }

    public void setExpectedCTC(String expectedCTC) {
        this.expectedCTC = expectedCTC;
    }

    public String getNoticePeriod() {
        return noticePeriod;
    }

    public void setNoticePeriod(String noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public Object getNoOfCompaniesWorked() {
        return noOfCompaniesWorked;
    }

    public void setNoOfCompaniesWorked(Object noOfCompaniesWorked) {
        this.noOfCompaniesWorked = noOfCompaniesWorked;
    }

    public String getQuickbloxID() {
        return quickbloxID;
    }

    public void setQuickbloxID(String quickbloxID) {
        this.quickbloxID = quickbloxID;
    }

    public Object getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(Object notificationID) {
        this.notificationID = notificationID;
    }

    public List<CandidateWorkLog> getCandidateWorkLogs() {
        return candidateWorkLogs;
    }

    public void setCandidateWorkLogs(List<CandidateWorkLog> candidateWorkLogs) {
        this.candidateWorkLogs = candidateWorkLogs;
    }

    public Object getPsychometricTest() {
        return psychometricTest;
    }

    public void setPsychometricTest(Object psychometricTest) {
        this.psychometricTest = psychometricTest;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(candidateID);
        dest.writeValue(firstName);
        dest.writeValue(lastName);
        dest.writeValue(emailID);
        dest.writeValue(phoneNumber);
        dest.writeValue(candidatePhotoURL);
        dest.writeValue(gender);
        dest.writeValue(candidateDOB);
        dest.writeValue(candidateType);
        dest.writeValue(referaredCompanyID);
        dest.writeValue(address);
        dest.writeValue(city);
        dest.writeValue(zipCode);
        dest.writeValue(createdDate);
        dest.writeValue(updateDate);
        dest.writeValue(designation);
        dest.writeValue(domain);
        dest.writeValue(yearsOfExperienceInMonths);
        dest.writeValue(currentCTC);
        dest.writeValue(expectedCTC);
        dest.writeValue(noticePeriod);
        dest.writeValue(noOfCompaniesWorked);
        dest.writeValue(quickbloxID);
        dest.writeValue(notificationID);
        dest.writeList(candidateWorkLogs);
        dest.writeValue(psychometricTest);
    }

    public int describeContents() {
        return  0;
    }

}
