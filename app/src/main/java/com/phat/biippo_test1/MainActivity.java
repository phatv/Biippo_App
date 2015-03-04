package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    ImageButton button_emer, button_tire, button_engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_emer = (ImageButton)findViewById(R.id.button_emer);
        button_emer.setOnClickListener(this);

        button_tire = (ImageButton)findViewById(R.id.button_Tire);
        button_tire.setOnClickListener(this);

        button_engine =(ImageButton)findViewById(R.id.button_engine);
        button_engine.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        if (id == R.id.about) {
            startActivity(new Intent("com.phat.about"));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void emer_click()
    {
        startActivity(new Intent("com.phat.emergency"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_emer:
                emer_click();
                break;
            case R.id.button_Tire:
                tire_click();
                break;
            case R.id.button_engine:
                engine_click();
                break;
        }
    }

    private void tire_click() {
        startActivity(new Intent("main.tire"));
    }

    private void engine_click() { startActivity(new Intent("com.phat.biippo_test1.engine"));}
}
