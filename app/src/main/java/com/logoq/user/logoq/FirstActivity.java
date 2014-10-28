package com.logoq.user.logoq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.logging.Level;


public class FirstActivity extends Activity {
    Button btnStart;
//    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btnStart= (Button) findViewById(R.id.btnStart);

    }
        public void showInfo(View v){

        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);

    }

    public void selectLevel(View v){

        Intent intent= new Intent(this, LevelActivity.class);
        startActivity(intent);
    }




}
