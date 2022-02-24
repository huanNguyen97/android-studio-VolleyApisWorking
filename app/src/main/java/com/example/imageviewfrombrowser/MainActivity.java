package com.example.imageviewfrombrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.example.imageviewfrombrowser.api.API_Variable;
import com.example.imageviewfrombrowser.api.API_Functional;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView1 = (TextView) findViewById(R.id.text1);
        final TextView textView2 = (TextView) findViewById(R.id.text2);
        final TextView textView3 = (TextView) findViewById(R.id.text3);
        final TextView textView4 = (TextView) findViewById(R.id.text4);
        final TextView textView5 = (TextView) findViewById(R.id.text5);

        API_Functional api = new API_Functional(MainActivity.this);

        // api.getDataFromAPI(textView); // -> OK
         api.getFirstNameFromAPI(textView1); // -> OK
         api.getLastNameFromAPI(textView2); // -> OK
         api.getEmailFromAPI(textView3); // -> OK
         api.getPhoneNumberFromAPI(textView4); // -> OK
         api.getPasswordFromAPI(textView5); // -> OK
    }
}
