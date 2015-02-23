package com.phat.biippo_test1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class tireRotation extends ActionBarActivity implements View.OnClickListener{

    ImageButton picture, video, written;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tire_rotation);

        picture = (ImageButton)findViewById(R.id.button_tireRotation_picture);
        picture.setOnClickListener(this);

        video = (ImageButton)findViewById(R.id.button_tireRotation_video);
        video.setOnClickListener(this);

        written = (ImageButton)findViewById(R.id.button_tireRotation_written);
        written.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_tireRotation_picture:
                startActivity(new Intent("main.tire.tireRotation.picture"));
                break;
            case R.id.button_tireRotation_video:
                startActivity(new Intent("main.tire.tireRotation.video"));
                break;
            case R.id.button_tireRotation_written:
                startActivity(new Intent("main.tire.tireRotation.written"));
                break;
        }
    }
}
