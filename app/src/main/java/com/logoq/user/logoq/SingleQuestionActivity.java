package com.logoq.user.logoq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class SingleQuestionActivity extends Activity {
    ImageView ivSingleQuestion;
    Button btnOk;
    EditText etxtAnswer;
    int[] ques, ansd;
    String[] ans;
    int position,level;
    String plrAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_question);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if (b!=null){

            ans= b.getStringArray("ans");
            position = b.getInt("index");
            ques = b.getIntArray("ques");
            level= b.getInt("level");

        }

        etxtAnswer= (EditText) findViewById(R.id.etxtAnswer);
        btnOk = (Button) findViewById(R.id.btnOk);
        ivSingleQuestion= (ImageView) findViewById(R.id.ivSingleQuestion);
        ivSingleQuestion.setImageDrawable(null);
        ivSingleQuestion.setImageResource(ques[position]);

    }
    public void checkAns(View v) {
        plrAns = etxtAnswer.getText().toString().toLowerCase();
        plrAns=plrAns.replace(" ","");
        if (plrAns.equals(ans[position])) {
            SharedPreferences sp= getSharedPreferences(getString(R.string.answer_preferences), MODE_PRIVATE);
            String ansStr= sp.getString("answered"+level,null);
            if (ansStr!=null){
                ansStr= ansStr +","+ String.valueOf(position);
            }
            else{
                ansStr=String.valueOf(position);
            }
            SharedPreferences spp= getSharedPreferences(getString(R.string.answer_preferences),MODE_PRIVATE);
            SharedPreferences.Editor ed = spp.edit();
            ed.putString("answered"+level,ansStr);
            ed.commit();


            Toast.makeText(SingleQuestionActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
            Intent in= new Intent(getApplicationContext(),Level1Activity.class);
            in.putExtra("index", position);
            in.putExtra("question", ques);
            in.putExtra("answer", ans);
            in.putExtra("level",level);
            in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(in);
            finish();
        } else {
            Toast.makeText(SingleQuestionActivity.this, "Wrong Answer Try Again", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.single_question, menu);
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
