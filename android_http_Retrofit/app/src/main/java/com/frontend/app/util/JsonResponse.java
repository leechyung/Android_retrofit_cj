package com.frontend.app.util;

import com.google.gson.annotations.SerializedName;

public class JsonResponse {
    @SerializedName("REPL_CD")
    private String status;

    public String getStatus() {
        return status;
    }

    public void JsonResponse(String status) {
        this.status = status;
    }

    @SerializedName("REPL_MSG")
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @SerializedName("username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
