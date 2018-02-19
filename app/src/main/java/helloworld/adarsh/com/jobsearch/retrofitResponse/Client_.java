
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Client_ implements Parcelable
{

    @SerializedName("clientID")
    @Expose
    private Integer clientID;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("authPersonName")
    @Expose
    private String authPersonName;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("mobileNum")
    @Expose
    private String mobileNum;
    @SerializedName("emailId")
    @Expose
    private String emailId;
    @SerializedName("streetAddr")
    @Expose
    private String streetAddr;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("pincode")
    @Expose
    private String pincode;
    @SerializedName("createdDate")
    @Expose
    private Long createdDate;
    @SerializedName("updatedDate")
    @Expose
    private Long updatedDate;
    @SerializedName("createdBy")
    @Expose
    private String createdBy;
    @SerializedName("quickbloxID")
    @Expose
    private String quickbloxID;
    @SerializedName("notificationID")
    @Expose
    private Object notificationID;
    @SerializedName("resetToken")
    @Expose
    private Object resetToken;
    @SerializedName("urlExpiry")
    @Expose
    private Object urlExpiry;
    @SerializedName("subscriptionValidityInMonths")
    @Expose
    private String subscriptionValidityInMonths;
    @SerializedName("subscribedFrom")
    @Expose
    private Long subscribedFrom;
    @SerializedName("subscribedTo")
    @Expose
    private Long subscribedTo;
    @SerializedName("trialDays")
    @Expose
    private Boolean trialDays;
    public final static Creator<Client_> CREATOR = new Creator<Client_>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Client_ createFromParcel(Parcel in) {
            return new Client_(in);
        }

        public Client_[] newArray(int size) {
            return (new Client_[size]);
        }

    }
    ;

    protected Client_(Parcel in) {
        this.clientID = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.companyName = ((String) in.readValue((String.class.getClassLoader())));
        this.authPersonName = ((String) in.readValue((String.class.getClassLoader())));
        this.designation = ((String) in.readValue((String.class.getClassLoader())));
        this.mobileNum = ((String) in.readValue((String.class.getClassLoader())));
        this.emailId = ((String) in.readValue((String.class.getClassLoader())));
        this.streetAddr = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.pincode = ((String) in.readValue((String.class.getClassLoader())));
        this.createdDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.updatedDate = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.createdBy = ((String) in.readValue((String.class.getClassLoader())));
        this.quickbloxID = ((String) in.readValue((String.class.getClassLoader())));
        this.notificationID = ((Object) in.readValue((Object.class.getClassLoader())));
        this.resetToken = ((Object) in.readValue((Object.class.getClassLoader())));
        this.urlExpiry = ((Object) in.readValue((Object.class.getClassLoader())));
        this.subscriptionValidityInMonths = ((String) in.readValue((String.class.getClassLoader())));
        this.subscribedFrom = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.subscribedTo = ((Long) in.readValue((Integer.class.getClassLoader())));
        this.trialDays = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
    }

    public Client_() {
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAuthPersonName() {
        return authPersonName;
    }

    public void setAuthPersonName(String authPersonName) {
        this.authPersonName = authPersonName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getStreetAddr() {
        return streetAddr;
    }

    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Long updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

    public Object getResetToken() {
        return resetToken;
    }

    public void setResetToken(Object resetToken) {
        this.resetToken = resetToken;
    }

    public Object getUrlExpiry() {
        return urlExpiry;
    }

    public void setUrlExpiry(Object urlExpiry) {
        this.urlExpiry = urlExpiry;
    }

    public String getSubscriptionValidityInMonths() {
        return subscriptionValidityInMonths;
    }

    public void setSubscriptionValidityInMonths(String subscriptionValidityInMonths) {
        this.subscriptionValidityInMonths = subscriptionValidityInMonths;
    }

    public Long getSubscribedFrom() {
        return subscribedFrom;
    }

    public void setSubscribedFrom(Long subscribedFrom) {
        this.subscribedFrom = subscribedFrom;
    }

    public Long getSubscribedTo() {
        return subscribedTo;
    }

    public void setSubscribedTo(Long subscribedTo) {
        this.subscribedTo = subscribedTo;
    }

    public Boolean getTrialDays() {
        return trialDays;
    }

    public void setTrialDays(Boolean trialDays) {
        this.trialDays = trialDays;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(clientID);
        dest.writeValue(companyName);
        dest.writeValue(authPersonName);
        dest.writeValue(designation);
        dest.writeValue(mobileNum);
        dest.writeValue(emailId);
        dest.writeValue(streetAddr);
        dest.writeValue(city);
        dest.writeValue(state);
        dest.writeValue(country);
        dest.writeValue(pincode);
        dest.writeValue(createdDate);
        dest.writeValue(updatedDate);
        dest.writeValue(createdBy);
        dest.writeValue(quickbloxID);
        dest.writeValue(notificationID);
        dest.writeValue(resetToken);
        dest.writeValue(urlExpiry);
        dest.writeValue(subscriptionValidityInMonths);
        dest.writeValue(subscribedFrom);
        dest.writeValue(subscribedTo);
        dest.writeValue(trialDays);
    }

    public int describeContents() {
        return  0;
    }

}
