package com.mad.android.mad_android.madapi;

import android.content.Context;

import com.squareup.okhttp.Interceptor;


import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by Ju on 19/01/2018.
 */

public class Api implements Interceptor {

    String BASE_URL = "http://10.0.2.2:3000";
    private final String appid;

    public Api(Context ctx){
        this.appid = ctx.getApplicationContext().getSharedPreferences("appid", Context.MODE_PRIVATE).getString("appid", null);
    }

    public Service service() {

        OkHttpClient httpClient = new OkHttpClient();
        // add your other interceptors …
        // add logging as last interceptor

        httpClient.interceptors().add(this);  // <-- this adds the header with the sessionId to every request

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build()
                .create(Service.class);
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder newRequest = chain.request().newBuilder();

        if (this.appid != null) {
            newRequest.addHeader("appid", this.appid);
        }

        return chain.proceed(newRequest.addHeader("deviceplatform", "android")
                .removeHeader("User-Agent")
                .addHeader("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:38.0) Gecko/20100101 Firefox/38.0")
                .build());

    }
}