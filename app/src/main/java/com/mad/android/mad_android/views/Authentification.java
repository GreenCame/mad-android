package com.mad.android.mad_android.views;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mad.android.mad_android.R;
import com.mad.android.mad_android.madapi.models.User;
import com.mad.android.mad_android.madapi.Api;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class Authentification extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        username = (EditText) findViewById(R.id.username_edit_text);
        password = (EditText) findViewById(R.id.password_edit_text);
        login = (Button) findViewById(R.id.button_login);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               login();
            }
        });;
    }

    protected void login(){
        if(username.getText().toString().length() == 0  && password.getText().toString().length() == 0) {
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
        } else {

            Call<User> call = new Api(this).service().getToken(username.getText().toString() + ':' + MD5_Hash(password.getText().toString()));

            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Response<User> response, Retrofit retrofit) {
                    Log.v("VVVV", response.body().getToken());


                    try {
                        SharedPreferences sharedPref = getApplicationContext().getSharedPreferences("appid", MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString("appid", response.body().getToken());
                        editor.apply();
                    } catch (Exception e) {
                        Log.d("onResponse", "There is an error");
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(Throwable t) {
                    Log.d("onFailure", t.toString());
                }
            });

            Toast.makeText(this,  getApplicationContext().getSharedPreferences("appid", MODE_PRIVATE).getString("appid", null), Toast.LENGTH_LONG).show();
        }
    }

    public static String MD5_Hash(String s) {
        MessageDigest m = null;

        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        m.update(s.getBytes(),0,s.length());
        String hash = new BigInteger(1, m.digest()).toString(16);
        return hash;
    }
}
