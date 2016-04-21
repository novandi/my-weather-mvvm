package com.srin.android.myweathermvvm.utility;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by SRIN on 4/20/2016.
 */
public interface IApiService {

    @GET("weather?lat={latitude}&lon={longitude}")
    Call<String> getWeatherByGeographic(@Path("latitude") String latitude, @Path("longitude") String longitude);

}
