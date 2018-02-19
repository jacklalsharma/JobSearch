package helloworld.adarsh.com.jobsearch.retrofit;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.List;

import helloworld.adarsh.com.jobsearch.retrofitResponse.AnswerSubmittedResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ChangedPasswordResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.ForgotPasswordResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobAcceptResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobOfferResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.JobRejectResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.PsychoTestResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Adarsh on 2/8/2018.
 */



public interface ApiInterface {
    @POST("forgot-password")
    Call<ForgotPasswordResponse> getForgotPasswordResponseCall(@Query("email") String email);

    @PUT("reset-password/{c_id}/{new_password}")
    Call<ChangedPasswordResponse> getPasswordResetCall(@Path(value = "c_id", encoded = true) String c_id, @Path(value = "new_password", encoded = true) String new_password);

    @GET("psychometric-questions")
    Call<List<PsychoTestResponse>> getPsychoQuestionsCall();

    @Headers("Content-Type:application/json")
    @POST("psychometric-test")
    Call<AnswerSubmittedResponse> submitPsychometricAnswers(@Body JsonObject answers);

    @GET("offers/{c_id}")
    Call<List<JobOfferResponse>> getJobOffers(@Path(value = "c_id", encoded = true) String c_id);

    @PUT("offer-reject/{id}")
    Call<JobRejectResponse> rejectJob(@Path(value = "id", encoded = true) String id);

    @PUT("offer-accept/{id}/{joining_date}")
    Call<JobAcceptResponse> acceptJob(@Path(value = "id",encoded = true) String id, @Path(value = "joining_date") String joining_date);
}

