package com.dipgital.dbkontak.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://jsonheiidip.000webhostapp.com/contact/";
    public static final String IMAGE_URL = "https://jsonheiidip.000webhostapp.com/contact/images/";

    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            try {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        return retrofit;
    }
}
