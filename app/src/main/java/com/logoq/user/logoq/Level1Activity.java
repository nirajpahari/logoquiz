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

import java.util.ArrayList;


public class Level1Activity extends Activity {
    GridView gridView;
    public int[] ques;
    public ArrayList<String[]> ansList= new ArrayList<String[]>();
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

            ansList= (ArrayList<String []>) b.getSerializable("answer");
            ques = b.getIntArray("question");
            level=b.getInt("level");
        }
        for (int ij=0; ij< ansList.size();ij++){
            String temp[] = ansList.get(ij);
            Log.e("entered in first","for");
            for (int ijk=0;ijk<temp.length;ijk++){
                Log.e("ansList("+ij+")("+ijk+")",""+temp[ijk]);
            }

        }
        //getting value from shared preferences
        SharedPreferences sp= getSharedPreferences(getString(R.string.answer_preferences), MODE_PRIVATE);
        ansStr= sp.getString("answered"+level,"");
//        Log.e("the answered aray for level","answered"+level);

        gridView.setAdapter(new ImageAdapter(this, ques, level));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String[] ansStrArr = ansStr.split(",");
                try {



                    for (int i = 0; i < (ansStrArr.length); i++) {

                        if (position == Integer.parseInt(ansStrArr[i])) {
                            p=0;
                            String ans[]=ansList.get(position);
                            Toast.makeText(getApplicationContext(),"Already Solved.Answer is : "+ans[0].toUpperCase(),Toast.LENGTH_SHORT).show();
                            Intent in= new Intent(getApplicationContext(),Level1Activity.class);
                            in.putExtra("index", position);
                            in.putExtra("question", ques);
                            in.putExtra("answer", ansList);
                            in.putExtra("level", level);
                            in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(in);
                        }

                    }

                }
                catch(Exception e){

                }
                if(p==1){
//                    int noc=ansStrArr.length;

                    String ans[]=ansList.get(position);
                    //test
                    for(int i=0;i<ans.length;i++){
                    Log.e("ans of position"+i,""+ans[i]);}
                    //
                    Intent intent = new Intent(getApplicationContext(), SingleQuestionActivity.class);
                    intent.putExtra("index", position);
                    intent.putExtra("answer",ansList);
                    intent.putExtra("ques", ques);
                    intent.putExtra("ans", ans);
                    intent.putExtra("level",level);
                    intent.putExtra("noOfCorrect", ansStrArr.length);
                    startActivity(intent);}

            }

        });
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(getApplicationContext(),LevelActivity.class);
        startActivity(i);
        finish();
    }



}
