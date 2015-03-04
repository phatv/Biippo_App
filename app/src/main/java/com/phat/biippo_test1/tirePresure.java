package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class tirePresure extends ActionBarActivity implements View.OnClickListener{

    ImageButton picture, video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tire_presure);
        picture = (ImageButton)findViewById(R.id.button_checkTirePressure_picture);
        picture.setOnClickListener(this);

        video = (ImageButton)findViewById(R.id.button_checkTirePressure_video);
        video.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_checkTirePressure_picture:
                startActivity(new Intent("main.tire.tirePresure.picture"));
                break;
            case R.id.button_checkTirePressure_video:
                startActivity(new Intent("main.tire.tirePresure.video"));
                break;
        }
    }
}
