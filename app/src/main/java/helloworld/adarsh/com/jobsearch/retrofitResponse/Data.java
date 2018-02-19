
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

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

    @Override
    public String toString() {
        return "";
        //return new ToStringBuilder(this).append("candidateID", candidateID).append("firstName", firstName).append("lastName", lastName).append("emailID", emailID).append("phoneNumber", phoneNumber).append("candidatePhotoURL", candidatePhotoURL).append("gender", gender).append("candidateDOB", candidateDOB).append("candidateType", candidateType).append("referaredCompanyID", referaredCompanyID).append("address", address).append("city", city).append("zipCode", zipCode).append("createdDate", createdDate).append("updateDate", updateDate).append("designation", designation).append("domain", domain).append("yearsOfExperienceInMonths", yearsOfExperienceInMonths).append("currentCTC", currentCTC).append("expectedCTC", expectedCTC).append("noticePeriod", noticePeriod).append("noOfCompaniesWorked", noOfCompaniesWorked).append("quickbloxID", quickbloxID).append("notificationID", notificationID).append("candidateWorkLogs", candidateWorkLogs).append("psychometricTest", psychometricTest).toString();
    }

}
