package com.example.imageviewfrombrowser.api;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.Request;
import com.example.imageviewfrombrowser.api.sub_api.AllDataResponsive;
import com.example.imageviewfrombrowser.api.sub_api.EmailResponsive;
import com.example.imageviewfrombrowser.api.sub_api.FirstNameResponsive;
import com.example.imageviewfrombrowser.api.sub_api.LastNameResponsive;
import com.example.imageviewfrombrowser.api.sub_api.PasswordResponsive;
import com.example.imageviewfrombrowser.api.sub_api.PhoneNumberResponsive;

import org.json.JSONObject;

public class API_Functional extends API_Variable {

    public API_Functional(Context context) {
        super(context);
    }

    // Callback to ResponseGetter for taking all data
    // from api
    // Get all
    public void getDataFromAPI(TextView textView) {
        AllDataResponsive api_getter = new AllDataResponsive(context);
        api_getter.getAllResponse(
            Request.Method.GET,
            null,
            new API_Variable.VolleyCallback() {
                @Override
                public void onJSONObjectSuccessResponse(JSONObject result) {
                    try {
                        JSONObject response = new JSONObject(result.toString());
                        textView.setText(response.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onStringSuccessResponse(String result) {
                    // Empty function //
                }
            }
        );
    }
    // End

    // Take first name string from api
    public void getFirstNameFromAPI(TextView textView) {
        FirstNameResponsive api_getter = new FirstNameResponsive(context);
        api_getter.getFirstNameResponse(
            Request.Method.GET,
            null,
            new API_Variable.VolleyCallback() {
                @Override
                public void onJSONObjectSuccessResponse(JSONObject result) {
                    // Empty function //
                }

                @Override
                public void onStringSuccessResponse(String result) {
                    try {
                        String response = new String(result.toString());
                        textView.setText(response.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }
    // End

    // Take last name string from api
    public void getLastNameFromAPI(TextView textView) {
        LastNameResponsive api_getter = new LastNameResponsive(context);
        api_getter.getLastNameResponse(
            Request.Method.GET,
            null,
            new API_Variable.VolleyCallback() {
                @Override
                public void onJSONObjectSuccessResponse(JSONObject result) {
                    // Empty function //
                }

                @Override
                public void onStringSuccessResponse(String result) {
                    try {
                        String response = new String(result.toString());
                        textView.setText(response.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }
    // End

    // Take email string from api
    public void getEmailFromAPI(TextView textView) {
        EmailResponsive api_getter = new EmailResponsive(context);
        api_getter.getEmailResponse(
            Request.Method.GET,
            null,
            new API_Variable.VolleyCallback() {
                @Override
                public void onJSONObjectSuccessResponse(JSONObject result) {
                    // Empty function //
                }

                @Override
                public void onStringSuccessResponse(String result) {
                    try {
                        String response = new String(result.toString());
                        textView.setText(response.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }
    // End

    // Take phone number string from api
    public void getPhoneNumberFromAPI(TextView textView) {
        PhoneNumberResponsive api_getter = new PhoneNumberResponsive(context);
        api_getter.getPhoneNumberResponse(
            Request.Method.GET,
            null,
            new API_Variable.VolleyCallback() {
                @Override
                public void onJSONObjectSuccessResponse(JSONObject result) {
                    // Empty function //
                }

                @Override
                public void onStringSuccessResponse(String result) {
                    try {
                        String response = new String(result.toString());
                        textView.setText(response.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }
    // End

    // Take password string from api
    public void getPasswordFromAPI(TextView textView) {
        PasswordResponsive api_getter = new PasswordResponsive(context);
        api_getter.getPasswordResponse(
            Request.Method.GET,
            null,
            new API_Variable.VolleyCallback() {
                @Override
                public void onJSONObjectSuccessResponse(JSONObject result) {
                    // Empty function //
                }

                @Override
                public void onStringSuccessResponse(String result) {
                    try {
                        String response = new String(result.toString());
                        textView.setText(response.toString());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        );
    }
    // End

    // End
}
