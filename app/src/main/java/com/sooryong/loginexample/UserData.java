package com.sooryong.loginexample;

import com.google.gson.annotations.SerializedName;

public class UserData {
    @SerializedName("UserName")
    String userName;

    @SerializedName("UserEmail")
    String userEmail;

    @SerializedName("UserPwd")
    String userPwd;
}
