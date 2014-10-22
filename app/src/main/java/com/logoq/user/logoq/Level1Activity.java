package com.logoq.user.logoq;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class Level1Activity extends Activity {
    GridView gridView;
    public int[] ques;
    public String[] ans;
//    int[] answered= {};
    String ansStr;
    int p=1,level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leveln);
//        getActionBar().hide();
        GridView gridView = (GridView) findViewById(R.id.gridview);
        //getting intent
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if (b!=null){

            ans= b.getStringArray("answer");
            ques = b.getIntArray("question");
            level=b.getInt("level");
        }
        //getting value from shared preferences
        SharedPreferences sp= getSharedPreferences(getString(R.string.answer_preferences), MODE_PRIVATE);
        ansStr= sp.getString("answered"+level,"");
        Log.e("the answered aray for level","answered"+level);

        gridView.setAdapter(new ImageAdapter(this, ques, level));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                try {
                   String[] ansStrArr = ansStr.split(",");


                    for (int i = 0; i < (ansStrArr.length); i++) {

                        if (position == Integer.parseInt(ansStrArr[i])) {
                            p=0;
                            Toast.makeText(getApplicationContext(),"Already Solved.Answer is : "+ans[position],Toast.LENGTH_SHORT).show();
                            Intent in= new Intent(getApplicationContext(),Level1Activity.class);
                            in.putExtra("index", position);
                            in.putExtra("question", ques);
                            in.putExtra("answer", ans);
                            in.putExtra("level", level);
                            in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(in);
                        }

                    }

                }
                catch(Exception e){

                }
                if(p==1){
                    Intent intent = new Intent(getApplicationContext(), SingleQuestionActivity.class);
                    intent.putExtra("index", position);
                    intent.putExtra("ques", ques);
                    intent.putExtra("ans", ans);
                    intent.putExtra("level",level);
                    startActivity(intent);}

            }

        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.level1, menu);
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
