package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class FluidLeakActivity extends ActionBarActivity implements View.OnClickListener{

    ImageButton picture, video, written;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluid_leak);
        picture = (ImageButton)findViewById(R.id.button_jumpstart_pictures);
        video = (ImageButton)findViewById(R.id.button_jumpstart_video);
        written = (ImageButton)findViewById(R.id.button_jumpstart_written);
        picture.setOnClickListener(this);
        video.setOnClickListener(this);
        written.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_jumpstart_pictures:
                startActivity(new Intent(FluidLeakActivity.this, FluidLeakPicture.class));
                break;
            case R.id.button_jumpstart_written:
                startActivity(new Intent(FluidLeakActivity.this, FluidLeakWritten.class));
                break;
            case R.id.button_jumpstart_video:
                startActivity(new Intent(FluidLeakActivity.this, FluidLeakVideo.class));
                break;
        }
    }
}
