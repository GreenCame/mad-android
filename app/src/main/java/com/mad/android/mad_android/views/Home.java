package com.mad.android.mad_android.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.mad.android.mad_android.R;

import com.mad.android.mad_android.views.Character.Character;

public class Home extends AppCompatActivity implements View.OnClickListener {
    private CardView userCard, statsCard, optionsCard, joinCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        userCard = (CardView) findViewById(R.id.userCard);
        statsCard = (CardView) findViewById(R.id.statsCard);
        optionsCard = (CardView) findViewById(R.id.optionsCard);
        joinCard = (CardView) findViewById(R.id.joinCard);

        userCard.setOnClickListener(this);
        statsCard.setOnClickListener(this);
        optionsCard.setOnClickListener(this);
        joinCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        /*switch (view.getId()){
            case R.id.userCard : i = new Intent(this, User.class);startActivity(i); break;
            case R.id.statsCard : i = new Intent(this, Stats.class);startActivity(i); break;
            case R.id.optionsCard : i = new Intent(this, Options.class);startActivity(i); break;
            case R.id.joinCard : i = new Intent(this, Character.class);startActivity(i); break;
            default: break;
        }*/

    }
}
