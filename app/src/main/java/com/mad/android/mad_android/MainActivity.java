package com.mad.android.mad_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mad.android.mad_android.views.Authentification;

public class MainActivity extends AppCompatActivity {

    TextView first_name;
    TextView last_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);

        startActivity(new Intent(this, Authentification.class));
    }
}
