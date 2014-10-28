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
    int position,level,noc;
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
            noc=b.getInt("noOfCorrect");

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
        int dist=distance(plrAns,ans[position]);
        if (plrAns.equals(ans[position])||(dist==1&&(plrAns.length()>=5||(dist==2&&(plrAns.length()>=15))))) {
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

if(noc==17 && level!=5){
    Toast.makeText(SingleQuestionActivity.this, "Correct Answer. "+ans[position].toUpperCase()+" You have unlocked new level", Toast.LENGTH_SHORT).show();
}else{
            Toast.makeText(SingleQuestionActivity.this, "Correct Answer "+ans[position].toUpperCase(), Toast.LENGTH_SHORT).show();}
            Intent in= new Intent(getApplicationContext(),Level1Activity.class);
            in.putExtra("index", position);
            in.putExtra("question", ques);
            in.putExtra("answer", ans);
            in.putExtra("level",level);
            in.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(in);
            finish();
        } else {
            if((dist>=1&&dist<4&&plrAns.length()<15)||(plrAns.length()>15&&dist<7)){
            Toast.makeText(SingleQuestionActivity.this, "You are Close!!! Try Again", Toast.LENGTH_SHORT).show();}
            else{Toast.makeText(SingleQuestionActivity.this, "Wrong Ans.Try Again", Toast.LENGTH_SHORT).show();}

        }
    }
    public static int distance(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        // i == 0
        int [] costs = new int [b.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= a.length(); i++) {
            // j == 0; nw = lev(i - 1, j)
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= b.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[b.length()];
    }

}
