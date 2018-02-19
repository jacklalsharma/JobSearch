package helloworld.adarsh.com.jobsearch.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Adarsh on 2/8/2018.
 */

public class ApiClient {

    public static final String BASE_URL = "http://54.213.64.34:8080/IRecruiter/candidate/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
