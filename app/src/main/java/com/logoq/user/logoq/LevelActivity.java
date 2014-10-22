package com.logoq.user.logoq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LevelActivity extends Activity {
    public int[] ques1 = {
            R.drawable.q11, R.drawable.q12, R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q110,R.drawable.q111,R.drawable.q112,
            R.drawable.q113,R.drawable.q114,R.drawable.q115,R.drawable.q116,R.drawable.q117,R.drawable.q118,R.drawable.q119,R.drawable.q120,R.drawable.q121};
    public String[] ans1={"cocacola","fanta","kantipurtelevision","khukuri","mayos","nabilbank","ncell","nepal1","nepalairlines","nepalarmy","nepalgovernment","nepalrastrabank","nepaltourismboard","ntvplus","pepsi","real","redbull","saarc","utl","waiwai","westernunion"};
    public int[] ques2 = {
            R.drawable.q21, R.drawable.q22, R.drawable.q23,R.drawable.q24,R.drawable.q25,R.drawable.q26,R.drawable.q27,R.drawable.q28,R.drawable.q29,R.drawable.q210,R.drawable.q211,R.drawable.q212,
            R.drawable.q213,R.drawable.q214,R.drawable.q215,R.drawable.q216,R.drawable.q217,R.drawable.q218,R.drawable.q219,R.drawable.q220,R.drawable.q221};
    public String[] ans2={"anfa","appy","bajekosekuwa","bankofkathmandu","bbcnepali","buddhaair","carlsberg","chaudharygroup","dishhome","frooti","honda","imagechannel","nepalinvestmentbank","nepalpolice","nepaltelecom","news24","suryanepal","tribhuwanuniversity","tuborg","yak","yamaha"};

    public int[] ques3 = {
            R.drawable.q31, R.drawable.q32, R.drawable.q33,R.drawable.q34,R.drawable.q35,R.drawable.q36,R.drawable.q37,R.drawable.q38,R.drawable.q39,R.drawable.q310,R.drawable.q311,R.drawable.q312,
            R.drawable.q313,R.drawable.q314,R.drawable.q315,R.drawable.q316,R.drawable.q317,R.drawable.q318,R.drawable.q319,R.drawable.q320,R.drawable.q321};
    public String[] ans3={"acc","avenuestelevision","bajaj","can","channelnepal","esewa","everestbank","hulas","kathmanduuniversity","lionsclub","megabank","nebico","nepalscout","nicasia","nokia","qfx","siddharthabank","simrikair","sprite","unilever","usaid"} ;
    public int[] ques4 = {
            R.drawable.q41, R.drawable.q42, R.drawable.q43,R.drawable.q44,R.drawable.q45,R.drawable.q46,R.drawable.q47,R.drawable.q48,R.drawable.q49,R.drawable.q410,R.drawable.q411,R.drawable.q412,
            R.drawable.q413,R.drawable.q414,R.drawable.q415,R.drawable.q416,R.drawable.q417,R.drawable.q418,R.drawable.q419,R.drawable.q420,R.drawable.q421};
    public String[] ans4={"angan","himalaya","hyundai","janatabank","laxmibank","marutisuzuki","nbbank","nepalolympiccommittee","nmbbank","pokharauniversity","primebank","radiokantipur","rotaryclub","ruslanvodka","sagarmathatelevision","saleways","standardchartered","taan","taraair","threestarclub","yetiairlines"};
    public int[] ques5 = {
            R.drawable.q51, R.drawable.q52, R.drawable.q53,R.drawable.q54,R.drawable.q55,R.drawable.q56,R.drawable.q57,R.drawable.q58,R.drawable.q59,R.drawable.q510};
    public String[]ans5={"bhatbhateni","globalimebank","grandbank","hero","himalayanbank","insec","kumaribank","leapfrog","maitinepal","radionepal"};
    int level;
    String ansStrArr1[],ansStrArr2[],ansStrArr3[],ansStrArr5[],ansStrArr4[];
    Button btnLevel1,btnLevel2,btnLevel3,btnLevel4,btnLevel5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        //get button by ids
        btnLevel1=(Button) findViewById(R.id.btnLevel1);
        btnLevel2=(Button) findViewById(R.id.btnLevel2);
        btnLevel3=(Button) findViewById(R.id.btnLevel3);
        btnLevel4=(Button) findViewById(R.id.btnLevel4);
        btnLevel5=(Button) findViewById(R.id.btnLevel5);
        //getting value from shared preferences
        SharedPreferences sp= getSharedPreferences(getString(R.string.answer_preferences), MODE_PRIVATE);
        String ansStr1= sp.getString("answered"+1,"");
        String ansStr2= sp.getString("answered"+2,"");
        String ansStr3= sp.getString("answered"+3,"");
        String ansStr4= sp.getString("answered"+4,"");
        String ansStr5= sp.getString("answered"+5,"");
        //splilt every answered variables
        try{
            ansStrArr1 = ansStr1.split(",");
            ansStrArr2 = ansStr2.split(",");
            ansStrArr3 = ansStr3.split(",");
            ansStrArr4 = ansStr4.split(",");
            ansStrArr5 = ansStr5.split(",");
            int lockRes=R.drawable.lock;
            if (ansStrArr1.length<17){
                btnLevel2.setEnabled(false);
                btnLevel2.setPadding(30,0,60,0);
                btnLevel2.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                btnLevel3.setEnabled(false);
                btnLevel3.setPadding(30,0,60,0);
                btnLevel3.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                btnLevel5.setEnabled(false);
                btnLevel5.setPadding(30,0,60,0);
                btnLevel5.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                btnLevel4.setEnabled(false);
                btnLevel4.setPadding(30,0,60,0);
                btnLevel4.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
            }
            if(ansStrArr2.length<17){
                btnLevel3.setEnabled(false);
                btnLevel3.setPadding(30,0,60,0);
                btnLevel3.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                btnLevel5.setEnabled(false);
                btnLevel5.setPadding(30,0,60,0);
                btnLevel5.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                btnLevel4.setEnabled(false);
                btnLevel4.setPadding(30,0,60,0);
                btnLevel4.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
            }
            if(ansStrArr3.length<17){
                btnLevel5.setEnabled(false);
                btnLevel5.setPadding(30,0,60,0);
                btnLevel5.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                btnLevel4.setEnabled(false);
                btnLevel4.setPadding(30,0,60,0);
                btnLevel4.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
            }
            if(ansStrArr4.length<17){
                btnLevel5.setEnabled(false);
                btnLevel5.setPadding(30,0,60,0);
                btnLevel5.setCompoundDrawablesWithIntrinsicBounds(lockRes, 0, 0, 0);
                }
        }
        catch (Exception e){}

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
            b3.putStringArray("answer", ans3);
            b3.putInt("level",3);
            i3.putExtras(b3);
            startActivity(i3);
            finish();
            break;
        case R.id.btnLevel4:
            Intent i4= new Intent(this,Level1Activity.class);
            Bundle b4= new Bundle();
            b4.putIntArray("question",ques4);
            b4.putStringArray("answer", ans4);
            b4.putInt("level",4);
            i4.putExtras(b4);
            startActivity(i4);
            finish();
            break;
        case R.id.btnLevel5:
            Intent i5= new Intent(this,Level1Activity.class);
            Bundle b5= new Bundle();
            b5.putIntArray("question",ques5);
            b5.putStringArray("answer", ans5);
            b5.putInt("level",5);
            i5.putExtras(b5);
            startActivity(i5);
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
