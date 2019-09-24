package com.sooryong.loginexample;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("/user/login")
    Call<UserData> userLogin(@Field("email") String email, @Field("password") String password);

    @POST("/user/join")
    Call<ResponseBody> userJoin(@Body UserData userData);
}