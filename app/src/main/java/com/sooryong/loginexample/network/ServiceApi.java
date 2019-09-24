package com.sooryong.loginexample.network;

import com.sooryong.loginexample.data.JoinData;
import com.sooryong.loginexample.data.JoinResponse;
import com.sooryong.loginexample.data.LoginData;
import com.sooryong.loginexample.data.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("/user/login")
    Call<LoginResponse> userLogin(@Body LoginData data);

    @POST("/user/join")
    Call<JoinResponse> userJoin(@Body JoinData data);
}