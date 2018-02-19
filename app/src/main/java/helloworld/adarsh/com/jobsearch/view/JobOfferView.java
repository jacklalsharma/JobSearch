package helloworld.adarsh.com.jobsearch.view;

import java.util.ArrayList;

import helloworld.adarsh.com.jobsearch.retrofitResponse.JobOfferResponse;

/**
 * Created by Adarsh on 2/11/2018.
 */

public interface JobOfferView {
    void onJobOffersGenerated(ArrayList<JobOfferResponse> jobOfferResponses);
    void onJobOffersNotRecieved();
    void onJobOfferSelected();
    void onSelectedJobResponseAccept();
    void onSelectedJobResponseReject();


}
