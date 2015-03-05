package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class EmergencyActivity extends ActionBarActivity implements View.OnClickListener{

    ImageButton button_jumpstart, button_fluidleak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        button_jumpstart = (ImageButton)findViewById(R.id.button_jumpstart);
        button_jumpstart.setOnClickListener(this);
        button_fluidleak = (ImageButton)findViewById(R.id.button_fluidleak);
        button_fluidleak.setOnClickListener(this);
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_emergency, menu);
        getActionBar().
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

    private void jumpstart_click()
    {
        startActivity(new Intent("com.phat.jumpstart"));
    }

    private void fluidleak_click()
    {
        startActivity(new Intent("com.phat.fluidleak"));
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_jumpstart:
                jumpstart_click();
                break;
            case R.id.button_fluidleak:
                fluidleak_click();
                break;
        }
    }
}
