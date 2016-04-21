package com.srin.android.myweathermvvm.utility;

import android.content.Context;

import retrofit2.Retrofit;

/**
 * Created by SRIN on 4/20/2016.
 */
public class RetrofitService {

    private static IApiService mIApiService;

    public static IApiService createInstance(Context context){
        if (mIApiService == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constanta.API.BASE_URL)
                    .build();
            mIApiService = retrofit.create(IApiService.class);
        }
        return mIApiService;
    }

}
