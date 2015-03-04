package com.phat.biippo_test1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class oilPage extends ActionBarActivity implements View.OnClickListener{

    ImageButton oilPicture, oilVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil_page);
        oilPicture = (ImageButton)findViewById(R.id.oilPicture);
        oilPicture.setOnClickListener(this);

        oilVideo = (ImageButton)findViewById(R.id.oilVideo);
        oilVideo.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_oil_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.oilPicture:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7xzQ-RIr0Cw")));
                Log.i("Video", "Video Playing....");
                break;
            case R.id.oilVideo:
                startActivity(new Intent("com.phat.biippo_test1.oilChange_video"));
                break;

        }
    }
}
