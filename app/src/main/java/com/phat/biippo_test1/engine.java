package com.phat.biippo_test1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
//import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class engine extends ActionBarActivity implements View.OnClickListener{

    ImageButton oilButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine);
        oilButton = (ImageButton)findViewById(R.id.oilButton);
        oilButton.setOnClickListener(this);
    }


    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_engine, menu);
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

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.oilButton:
                startActivity(new Intent("com.phat.biippo_test1.oilPage"));
                break;

        }
    }
}
