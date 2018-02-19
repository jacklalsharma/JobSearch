package helloworld.adarsh.com.jobsearch.implementor;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import helloworld.adarsh.com.jobsearch.presenter.PsychometricTestPresenter;
import helloworld.adarsh.com.jobsearch.retrofit.ApiClient;
import helloworld.adarsh.com.jobsearch.retrofit.ApiInterface;
import helloworld.adarsh.com.jobsearch.retrofitResponse.AnswerSubmittedResponse;
import helloworld.adarsh.com.jobsearch.retrofitResponse.PsychoTestResponse;
import helloworld.adarsh.com.jobsearch.view.PsychometricTestView;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Adarsh on 2/10/2018.
 */

public class PsychometricTestImpl implements PsychometricTestPresenter{

    private PsychometricTestView psychometricTestView;
    private ApiInterface apiService;
    private ArrayList<PsychoTestResponse> psychoTestResponses;

    public PsychometricTestImpl(PsychometricTestView psychometricTestView) {
        this.psychometricTestView = psychometricTestView;
        apiService = ApiClient.getClient().create(ApiInterface.class);

    }



    @Override
    public void getPsychometricQuestions(Context context) {
        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Psychometric Questions");
        progressDialog.setMessage("Please wait while fetching questions");
        progressDialog.setCancelable(false);
        progressDialog.show();



        Call<List<PsychoTestResponse>> call = apiService.getPsychoQuestionsCall();
        call.enqueue(new Callback<List<PsychoTestResponse>>() {
            @Override
            public void onResponse(Call<List<PsychoTestResponse>> call, Response<List<PsychoTestResponse>> response) {
                if(response.body() != null){
                    psychometricTestView.onPsychometricQuestionsReceived(response.body());
                    psychoTestResponses = new ArrayList<>(response.body());
                }else{
                    psychometricTestView.onPsychometricQuestionsNotReceived("Failed to receive questions.");
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<List<PsychoTestResponse>> call, Throwable t) {
                psychometricTestView.onPsychometricQuestionsNotReceived("Failed to receive questions.");
                progressDialog.dismiss();
            }
        });

    }

    @Override
    public void submitPsychometricAnswers(Context context, String cId) {
        if(psychoTestResponses != null){
            submitAnswer(context, cId);
        }else{

        }
    }

    /**
     *
     * @param context
     */
    private void submitAnswer(Context context, String cId){
        JSONObject object = null;
        try{
            object = new JSONObject();
            for(int i = 0 ; i < psychoTestResponses.size() ; ++i){
                object.put(psychoTestResponses.get(i).getCalibratedBehaviour(), psychoTestResponses.get(i).getAnswer());
                if(psychoTestResponses.get(i).getAnswer().equals("")){
                    psychometricTestView.onQuestionsNotAnswered();
                    return;
                }
            }
            JSONObject candidate = new JSONObject();
            candidate.put("candidateID", cId);
            object.put("candidate", candidate);
            Log.d("ANSWER", object.toString());
        }catch (JSONException e){
            Log.d("ANSWERS_EX", e.toString());
            object = null;
        }

        final ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Psychometric Questions");
        progressDialog.setMessage("Please wait while we are sending your answers.");
        progressDialog.setCancelable(false);
        progressDialog.show();

        /*String ans = "{" +
                "" +
                "riskTaking:stronglyAgree," +
                "" +
                "detailOriented:stronglyAgree," +
                "" +
                "conflictAvoidance: donotAgree," +
                "" +
                "boredEasilyAndCreativelyInclined:mostlyAgree," +
                "" +
                "bigPictureAndLongTerm: stronglyAgree," +
                "" +
                "peopleOrientationAndSensitivity: mostlyAgree," +
                "" +
                "spontanietyAndFun: stronglyAgree," +
                "" +
                "dominantAndTaskFocussed: slightlyAgree," +
                "" +
                "meticulousAndThorough: mostlyAgree," +
                "" +
                "shyConforming: slightlyAgree," +
                "" +
                "optimism: slightlyAgree," +
                "" +
                "critical: stronglyAgree," +
                "" +
                "warm: stronglyAgree," +
                "" +
                "demanding: slightlyAgree," +
                "" +
                "impatience: mostlyAgree," +
                "" +
                "patience: mostlyAgree," +
                "" +
                "cautious: stronglyAgree," +
                "" +
                "impulsive: donotAgree," +
                "" +
                "vague: mostlyAgree," +
                "" +
                "exact: stronglyAgree," +
                "" +
                "candidate: {" +
                "" +
                "      candidateID:308" +
                "" +
                "}" +
                "" +
                "}" +
                "" +
                " ";
        */
        if(object != null){
            try{
                JsonParser jsonParser = new JsonParser();
                JsonObject gsonObject = (JsonObject) jsonParser.parse(object.toString());
                Call<AnswerSubmittedResponse> call = apiService.submitPsychometricAnswers(gsonObject);
                call.enqueue(new Callback<AnswerSubmittedResponse>() {
                    @Override
                    public void onResponse(Call<AnswerSubmittedResponse> call, Response<AnswerSubmittedResponse> response) {
                        progressDialog.dismiss();
                        if(response.body().getStatusCode() == -1){
                            psychometricTestView.onAnswerSubmissionFailed(response.body().getData());
                        }else{
                            Log.d("SUBMITTED", response.body().getData());
                            psychometricTestView.onAnswersSubmitted();
                        }
                    }

                    @Override
                    public void onFailure(Call<AnswerSubmittedResponse> call, Throwable t) {
                        progressDialog.dismiss();
                    }
                });

            }catch (Exception e){

            }

        }
    }
}
