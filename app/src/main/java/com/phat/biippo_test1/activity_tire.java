package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class activity_tire extends ActionBarActivity implements View.OnClickListener{

    ImageButton changeTire, tirePresure, tireRotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_tire);
        changeTire = (ImageButton)findViewById(R.id.button_changeTire);
        changeTire.setOnClickListener(this);

        tirePresure = (ImageButton)findViewById(R.id.button_tirePresure);
        tirePresure.setOnClickListener(this);
        //test
        tireRotation = (ImageButton)findViewById(R.id.button_tireRotation);
        tireRotation.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_changeTire:
                startActivity(new Intent("main.tire.changeTire"));
                break;
            case R.id.button_tirePresure:
                startActivity(new Intent("main.tire.tirePresure"));
                break;
            case R.id.button_tireRotation:
                startActivity(new Intent("main.tire.tireRotation"));
                break;
        }
    }
}
