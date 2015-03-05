package com.phat.biippo_test1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;


public class tireRotation extends ActionBarActivity implements View.OnClickListener{

    ImageButton picture, video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tire_rotation);

        picture = (ImageButton)findViewById(R.id.button_tireRotation_picture);
        picture.setOnClickListener(this);

        video = (ImageButton)findViewById(R.id.button_tireRotation_video);
        video.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_tireRotation_picture:
                startActivity(new Intent("main.tire.tireRotation.picture"));
                break;
            case R.id.button_tireRotation_video:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Elr8aki-TlQ")));
                Log.i("Video", "Video Playing....");
                break;
        }
    }
}
