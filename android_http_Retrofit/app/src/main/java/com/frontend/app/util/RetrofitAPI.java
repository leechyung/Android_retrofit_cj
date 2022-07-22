package com.frontend.app.util;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitAPI {

    @GET("/user/getUser")
    Call<JsonResponse>getUser();

    @Headers({"Content-Type: application/json"})
    @POST("/user/getUser")
    Call<JsonResponse> userJoin(@Body JsonRequest data);

}
