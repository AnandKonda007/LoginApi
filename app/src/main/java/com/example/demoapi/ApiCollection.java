package com.example.demoapi;


import com.google.gson.JsonObject;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface ApiCollection {
     String BASE_URL = "http://liveapi-vmart.softexer.com/api/";

    @POST
    Call<ResponseBody> apisCalling(@Body JsonObject jsonObject, @Url String url);




}
