package com.logoq.user.logoq;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class LevelActivity extends ActionBarActivity {
    public int[] ques1 = {
            R.drawable.q1, R.drawable.q2, R.drawable.q3,R.drawable.q4,R.drawable.q5,R.drawable.q6,R.drawable.q7,R.drawable.q8,R.drawable.q9,R.drawable.q10,R.drawable.q11,R.drawable.q12,
            R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q20,R.drawable.q21,R.drawable.q22,R.drawable.q23,R.drawable.q24,R.drawable.q25,R.drawable.q26,R.drawable.q27
    };
    public String[] ans1 = {"aircel", "airindia", "airtel", "amul", "asian paints", "bsnl", "dabur", "dlf", "eicer", "force", "hp", "icici",
            "lic", "mahindra", "micromax", "myntra.com", "nestle", "sbi", "suzuki", "tata", "telenor", "thumbsup",
            "tvs", "unilever", "videocon", "vodafon","wipro"};
    public int[] ques2 = {
            R.drawable.q1, R.drawable.q2, R.drawable.q3,R.drawable.q4,R.drawable.q5,R.drawable.q6,R.drawable.q7,R.drawable.q8,R.drawable.q9,R.drawable.q10,R.drawable.q11,R.drawable.q12,
            R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q20,R.drawable.q21,R.drawable.q22,R.drawable.q23,R.drawable.q24,R.drawable.q25,R.drawable.q26,R.drawable.q27
    };
    public String[] ans2 = {"aircel", "airindia", "airtel", "amul", "asian paints", "bsnl", "dabur", "dlf", "eicer", "force", "hp", "icici",
            "lic", "mahindra", "micromax", "myntra.com", "nestle", "sbi", "suzuki", "tata", "telenor", "thumbsup",
            "tvs", "unilever", "videocon", "vodafon","wipro"};
    public int[] ques3 = {
            R.drawable.q1, R.drawable.q2, R.drawable.q3,R.drawable.q4,R.drawable.q5,R.drawable.q6,R.drawable.q7,R.drawable.q8,R.drawable.q9,R.drawable.q10,R.drawable.q11,R.drawable.q12,
            R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q20,R.drawable.q21,R.drawable.q22,R.drawable.q23,R.drawable.q24,R.drawable.q25,R.drawable.q26,R.drawable.q27
    };
    public String[] ans3 = {"aircel", "airindia", "airtel", "amul", "asian paints", "bsnl", "dabur", "dlf", "eicer", "force", "hp", "icici",
            "lic", "mahindra", "micromax", "myntra.com", "nestle", "sbi", "suzuki", "tata", "telenor", "thumbsup",
            "tvs", "unilever", "videocon", "vodafon","wipro"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

    }
public void showLevel1(View v){
    switch (v.getId()){
        case R.id.btnLevel1:
    Intent i1= new Intent(this,Level1Activity.class);
    Bundle b1= new Bundle();
    b1.putIntArray("question",ques1);
    b1.putStringArray("answer",ans1);
            b1.putInt("level",1);
    i1.putExtras(b1);
    startActivity(i1);
            finish();
            break;
        case R.id.btnLevel2:
            Intent i2= new Intent(this,Level1Activity.class);

            Bundle b2= new Bundle();
            b2.putIntArray("question",ques2);
            b2.putStringArray("answer",ans2);
            b2.putInt("level",2);
            i2.putExtras(b2);
            startActivity(i2);
            finish();
            break;
        case R.id.btnLevel3:
            Intent i3= new Intent(this,Level1Activity.class);
            Bundle b3= new Bundle();
            b3.putIntArray("question",ques3);
            b3.putStringArray("answer",ans3);
            b3.putInt("level",3);
            i3.putExtras(b3);
            startActivity(i3);
            finish();
            break;
    }
}
//    public void showLevel2(View v){
//        Intent i= new Intent(this,Level1Activity.class);
//        startActivity(i);
//    }
//    public void showLevel3(View v){
//        Intent i= new Intent(this,Level1Activity.class);
//        startActivity(i);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.level, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
