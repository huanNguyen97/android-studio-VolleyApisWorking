package com.example.imageviewfrombrowser.api;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import org.json.JSONObject;

public class API_Variable {
    // Initialize variable
    public final String url = "https://randomuser.me/api/0.4/?randomapi";
    public Context context;
    // End

    // Interface
    public interface VolleyCallback {
        void onJSONObjectSuccessResponse(JSONObject result);
        void onStringSuccessResponse(String result);
    }
    // End interface

    // Constructor
    public API_Variable(Context context) {
        this.context = context;
    }
    // End

    // Getter and Setter
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    // End
}
