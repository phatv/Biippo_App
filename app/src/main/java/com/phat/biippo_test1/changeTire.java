package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class changeTire extends ActionBarActivity implements View.OnClickListener{

    ImageButton picture, video, written;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_tire);

        picture = (ImageButton)findViewById(R.id.button_changeTire_pictures);
        picture.setOnClickListener(this);

        video = (ImageButton)findViewById(R.id.button_changeTire_video);
        video.setOnClickListener(this);

        written = (ImageButton)findViewById(R.id.button_changeTire_written);
        written.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_changeTire_pictures:
                startActivity(new Intent("main.tire.changeTire.picture"));
                break;
            case R.id.button_changeTire_video:
                startActivity(new Intent("main.tire.changeTire.video"));
                break;
            case R.id.button_changeTire_written:
                startActivity(new Intent("main.tire.changeTire.written"));
                break;
        }
    }
}
