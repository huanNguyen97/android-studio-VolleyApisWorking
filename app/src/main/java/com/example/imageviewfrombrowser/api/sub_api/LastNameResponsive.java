package com.example.imageviewfrombrowser.api.sub_api;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.imageviewfrombrowser.api.API_Variable;
import com.example.imageviewfrombrowser.api.elements.MySingleTon;

import org.json.JSONException;
import org.json.JSONObject;

public class LastNameResponsive extends API_Variable {
    public LastNameResponsive(Context context) {
        super(context);
    }

    // Take response
    public void getLastNameResponse(
        int method,
        JSONObject jsonValue,
        final VolleyCallback callback
    ) {
        RequestQueue queue = MySingleTon.getInstance(context).getRequestQueue();

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
            Request.Method.GET,
            url,
            null,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {
                    try {
                        callback.onStringSuccessResponse(
                            response
                                .getJSONArray("results")
                                .getJSONObject(0)
                                .getJSONObject("user")
                                .getJSONObject("name")
                                .getString("last")
                        );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    // Error handle
                }
            }
        );

        MySingleTon.getInstance(context).addToRequestQueue(jsonObjectRequest);
    }
    // End
}
