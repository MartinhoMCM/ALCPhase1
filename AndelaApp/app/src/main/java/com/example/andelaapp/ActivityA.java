package com.example.andelaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityA extends AppCompatActivity implements View.OnClickListener {

    private Button buttonA;
    private Button buttonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        buttonA=findViewById(R.id.mAbout);
        buttonB=findViewById(R.id.mProfile);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.mAbout:
                startActivity(new Intent(this, ActivityB.class));
                break;

            case R.id.mProfile:
                startActivity(new Intent(this, ActivityC.class));
                break;


        }    }
}
