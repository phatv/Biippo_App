package com.phat.biippo_test1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
//import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class JumpStartActivity extends ActionBarActivity implements View.OnClickListener{

    ImageButton button_video, button_instr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump_start);

        button_video = (ImageButton)findViewById(R.id.button_jumpstart_video);
        button_video.setOnClickListener(this);
        button_instr = (ImageButton)findViewById(R.id.button_jumpstart_instr);
        button_instr.setOnClickListener(this);
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jump_start, menu);
        return true;
    }*/

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

    private void video_click()
    {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=MEtJnwnjcU4")));
        Log.i("Video", "Video Playing....");
    }

    private void instr_click()
    {
        startActivity(new Intent("com.phat.jumpstartpictures"));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_jumpstart_video:
                video_click();
                break;
            case R.id.button_jumpstart_instr:
                instr_click();
                break;
        }
    }
}
