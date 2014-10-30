package com.logoq.user.logoq;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


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
    public String[] ans3={"acc","avenuestelevision","bajaj","can","channelnepal","esewa","everestbank","hulas","kathmanduuniversity","lionsclub","megabank","nebico","nepalscout","nicasia","bigfootsoftwares","qfx","siddharthabank","simrikair","sprite","unilever","usaid"} ;
    public int[] ques4 = {
            R.drawable.q41, R.drawable.q42, R.drawable.q43,R.drawable.q44,R.drawable.q45,R.drawable.q46,R.drawable.q47,R.drawable.q48,R.drawable.q49,R.drawable.q410,R.drawable.q411,R.drawable.q412,
            R.drawable.q413,R.drawable.q414,R.drawable.q415,R.drawable.q416,R.drawable.q417,R.drawable.q418,R.drawable.q419,R.drawable.q420,R.drawable.q421};
    public String[] ans4={"angan","himalaya","hyundai","janatabank","laxmibank","marutisuzuki","nbbank","nepalolympiccommittee","nmbbank","pokharauniversity","primebank","radiokantipur","rotaryclub","ruslanvodka","sagarmathatelevision","saleways","standardchartered","taan","taraair","threestarclub","yetiairlines"};
    public int[] ques5 = {
            R.drawable.q51, R.drawable.q52, R.drawable.q53,R.drawable.q54,R.drawable.q55,R.drawable.q56,R.drawable.q57,R.drawable.q58,R.drawable.q59,R.drawable.q510,R.drawable.q511,R.drawable.q512,R.drawable.q513,R.drawable.q514,R.drawable.q515,R.drawable.q516,R.drawable.q517,R.drawable.q518,R.drawable.q519,R.drawable.q520,R.drawable.q521};
    public String[]ans5={"asianpaints","bhatbhateni","broadlink","can","chocofun","globalimebank","grandbank","hama","hellopaisa","hero","himalayanbank","hitsfm","insec","jagadamba","kumaribank","nds","panchakanya","radionepal","sherpa","springwood","worldlink"};
    int level;
    String ansStrArr1[],ansStrArr2[],ansStrArr3[],ansStrArr5[],ansStrArr4[];
    Button btnLevel1,btnLevel2,btnLevel3,btnLevel4,btnLevel5;
    TextView tvLevel1,tvLevel2,tvLevel3,tvLevel4,tvLevel5;
    //String array for level 1
    String q11ans[]={"cocacola"},q12ans[]={"fanta"}, q13ans[]={"kantipur tv","kantipurtelevision","kantipurtelevisionnetwork"},q14ans[]={"khukuri","khukurichurot","khukuricigarette"},
    q15ans[]={"mayos","mayosnoodles"},q16ans[]={"nabil bank","nabilbanklimited","nabil"},q17ans[]={"ncell"},q18ans[]={"nepal1","nepalone","nepal1television","nepalonetelevision"},q19ans[]={"nepalairlines","nepalairlinescorporation","nac"},
    q110ans[]={"nepalarmy"},q111ans[]={"nepalgovernment","governmentofnepal","nepalgov"},q112ans[]={"nepalrastrabank","rastrabank"},q113ans[]={"nepaltourismboard","ntb"},q114ans[]={"ntvplus","nepaltelevisionplus","ntv+","nepaltelevision+"},q115ans[]={"pepsi"},
    q116ans[]={"real","realjuice","realfruitjuice"},q117ans[]={"redbull"},q118ans[]={"saarc","southasianassociationforregionalcorporation"},q119ans[]={"utl","unitedtelecomlimited"},q120ans[]={"waiwai"},q121ans[]={"westernunion","westernunionmoneytransfer"};
    //String array for level2
    String q21ans[]={"anfa","allnepalfootballassociation"},q22ans[]={"appy","appyjuice"},q23ans[]={"bajekosekuwa"},q24ans[]={"bankofkathmandu","bok"},q25ans[]={"bbcnepali"},q26ans[]={"buddhaair","buddhaairlines"},q27ans[]={"carlsberg","carlsbergbeer"},
    q28ans[]={"chaudharygroup","cg"},q29ans[]={"dishhome","dishhomedth"},q210ans[]={"frooti","frootijuice"},q211ans[]={"honda"},q212ans[]={"imagechannel","image","imagetv","imagetelevision"},q213ans[]={"nepalinvestmentbanklimited","nepalinvestmentbank","nibl"},
    q214ans[]={"nepalpolice"},q215ans[]={"nepaltelecom","ntc","namaste"},q216ans[]={"news24","news24channel"},q217ans[]={"suryanepal"},q218ans[]={"tribhuwanuniversity","tu"},q219ans[]={"tuborg","tuborgbeer"},q220ans[]={"yak","yakchurot","yakcigarette"},q221ans[]={"yamaha"};
    //String array for level3
    String q31ans[]={"acc","asiancricketcouncil"},q32ans[]={"avenuestv","avenues","avenueschannel","avenuestelevision"},q33ans[]={"bajaj"},q34ans[]={"can","computerassociationnepal"},q35ans[]={"channelnepal"},q36ans[]={"esewa"},q37ans[]={"everestbank","ebl","everestbanklimited"},
    q38ans[]={"hulas"},q39ans[]={"kathmanduuniversity","ku"},q310ans[]={"lionsclub","lions"},q311ans[]={"megabank","mega","megabanklimited"},q312ans[]={"nebiko"},q313ans[]={"nepalscout","scout","nepalscouts"},q314ans[]={"nicasia","nicasiabank"},q315ans[]={"bigfootsoftwares","bigfoot"},
            q316ans[]={"qfx"},q317ans[]={"siddharthabank","siddhartha","siddharthabanklimited"},q318ans[]={"simrikair","simrikairlines","simrik"},q319ans[]={"sprite"},q320ans[]={"unilever","unilevernepal"},q321ans[]={"usaid","unitedstatesagencyforinternationaldevelopment"};
    //String array for level4
    String q41ans[]={"angan","angansweets"},q42ans[]={"himalaya","himalayachannel","himalayatelevision","himalayatv"},q43ans[]={"hyundai","hyundaimotors"},q44ans[]={"janatabank","janata","janatabanklimited"},q45ans[]={"laxmibank","laxmi","laxmibanklimited"},q46ans[]={"marutisuzuki","maruti","suzuki"},
    q47ans[]={"nbbank","nepalbangladeshbank","nb"},q48ans[]={"nepalolympiccommittee","noc"},q49ans[]={"nmbbank","nmb","nepalmerchantbank"},q410ans[]={"pokharauniversity","pu"},q411ans[]={"primebank","prime"},q412ans[]={"radiokantipur","kantipurradio","kantipur"},q413ans[]={"rotaryinternational","rotary","rotaryclub"},
            q414ans[]={"ruslanvodka","ruslan",},q415ans[]={"sagarmathatv","sagarmatha","sagarmathatelevision"},q416ans[]={"saleways","salewaysdepartmentalstore"},q417ans[]={"standardchartered","standardcharteredbank"},q418ans[]={"taan","treakingagenciesassociationofnepal"},q419ans[]={"taraair","tara"},q420ans[]={"threestarclub","tsc"},q421ans[]={"yetiairlines","yeti","yetiair"};
    //String array for level5
    String q51ans[]={"asianpaints"},q52ans[]={"bhatbhateni","bhatbhatenisupermarket"},q53ans[]={"broadlink","broadlinkcommunications"},q54ans[]={"can","cricketassociationnepal","cricketassociationofnepal"},q55ans[]={"chocofun"},q56ans[]={"globalimebank","globalime"},q57ans[]={"grandbank","grand"},
    q58ans[]={"hama","hamasteels"},q59ans[]={"hellopaisa"},q510ans[]={"hero","heromotocorp"},q511ans[]={"himalayanbank","himalayan"},q512ans[]={"hitsfm","hits"},q513ans[]={"insec"},q514ans[]={"jagadamba","jagadambacement"},q515ans[]={"kumaribank","kumari"},q516ans[]={"nd's","nds","nepaldiarys","nepaldiary"},
            q517ans[]={"panchakanya","panchakanyasteels"},q518ans[]={"radionepal"},q519ans[]={"sherpa"},q520ans[]={"springwood"},q521ans[]={"worldlink"};
    //ArrayList for level 1 answers
    ArrayList<String[]> ansListL1 = new ArrayList<String[]>();
    //ArrayList for level 2 answers
    ArrayList<String[]> ansListL2 = new ArrayList<String[]>();
    //ArrayList for level 3 answers
    ArrayList<String[]> ansListL3 = new ArrayList<String[]>();
    //ArrayList for level 4 answers
    ArrayList<String[]> ansListL4 = new ArrayList<String[]>();
    //ArrayList for level 5 answers
    ArrayList<String[]> ansListL5 = new ArrayList<String[]>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        // Putting level1 answers in ansList
        ansListL1.add(q11ans);ansListL1.add(q12ans);ansListL1.add(q13ans);ansListL1.add(q14ans);ansListL1.add(q15ans);ansListL1.add(q16ans);
        ansListL1.add(q17ans);ansListL1.add(q18ans);ansListL1.add(q19ans);ansListL1.add(q110ans);ansListL1.add(q111ans);ansListL1.add(q112ans);
        ansListL1.add(q113ans);ansListL1.add(q114ans);ansListL1.add(q115ans);ansListL1.add(q116ans);ansListL1.add(q117ans);ansListL1.add(q118ans);
        ansListL1.add(q119ans);ansListL1.add(q120ans);ansListL1.add(q121ans);
        //Putting level2 answers in ansList
        ansListL2.add(q21ans);ansListL2.add(q22ans);ansListL2.add(q23ans);ansListL2.add(q24ans);ansListL2.add(q25ans);ansListL2.add(q26ans);
        ansListL2.add(q27ans);ansListL2.add(q28ans);ansListL2.add(q29ans);ansListL2.add(q210ans);ansListL2.add(q211ans);ansListL2.add(q212ans);
        ansListL2.add(q213ans);ansListL2.add(q214ans);ansListL2.add(q215ans);ansListL2.add(q216ans);ansListL2.add(q217ans);ansListL2.add(q218ans);
        ansListL2.add(q219ans);ansListL2.add(q220ans);ansListL2.add(q221ans);
        // Putting level3 answers in ansList
        ansListL3.add(q31ans);ansListL3.add(q32ans);ansListL3.add(q33ans);ansListL3.add(q34ans);ansListL3.add(q35ans);ansListL3.add(q36ans);
        ansListL3.add(q37ans);ansListL3.add(q38ans);ansListL3.add(q39ans);ansListL3.add(q310ans);ansListL3.add(q311ans);ansListL3.add(q312ans);
        ansListL3.add(q313ans);ansListL3.add(q314ans);ansListL3.add(q315ans);ansListL3.add(q316ans);ansListL3.add(q317ans);ansListL3.add(q318ans);
        ansListL3.add(q319ans);ansListL3.add(q320ans);ansListL3.add(q321ans);
        // Putting level4 answers in ansList
        ansListL4.add(q41ans);ansListL4.add(q42ans);ansListL4.add(q43ans);ansListL4.add(q44ans);ansListL4.add(q45ans);ansListL4.add(q46ans);
        ansListL4.add(q47ans);ansListL4.add(q48ans);ansListL4.add(q49ans);ansListL4.add(q410ans);ansListL4.add(q411ans);ansListL4.add(q412ans);
        ansListL4.add(q413ans);ansListL4.add(q414ans);ansListL4.add(q415ans);ansListL4.add(q416ans);ansListL4.add(q417ans);ansListL4.add(q418ans);
        ansListL4.add(q419ans);ansListL4.add(q420ans);ansListL4.add(q421ans);
        // Putting level5 answers in ansList
        ansListL5.add(q51ans);ansListL5.add(q52ans);ansListL5.add(q53ans);ansListL5.add(q54ans);ansListL5.add(q55ans);ansListL5.add(q56ans);
        ansListL5.add(q57ans);ansListL5.add(q58ans);ansListL5.add(q59ans);ansListL5.add(q510ans);ansListL5.add(q511ans);ansListL5.add(q512ans);
        ansListL5.add(q513ans);ansListL5.add(q514ans);ansListL5.add(q515ans);ansListL5.add(q516ans);ansListL5.add(q517ans);ansListL5.add(q518ans);
        ansListL5.add(q519ans);ansListL5.add(q520ans);ansListL5.add(q521ans);
        for (int ij=0; ij< ansListL1.size();ij++){
            String temp[] = ansListL1.get(ij);
            Log.e("entered in first","for");
            for (int ijk=0;ijk<temp.length;ijk++){
                Log.e("ansList("+ij+")("+ijk+")",""+temp[ijk]);
            }

        }

        //get button by ids
        btnLevel1=(Button) findViewById(R.id.btnLevel1);
        btnLevel2=(Button) findViewById(R.id.btnLevel2);
        btnLevel3=(Button) findViewById(R.id.btnLevel3);
        btnLevel4=(Button) findViewById(R.id.btnLevel4);
        btnLevel5=(Button) findViewById(R.id.btnLevel5);
        //get textviews by it ids
      tvLevel1=(TextView) findViewById(R.id.tvLevel1);
        tvLevel2=(TextView) findViewById(R.id.tvLevel2);
        tvLevel3=(TextView) findViewById(R.id.tvLevel3);
        tvLevel4=(TextView) findViewById(R.id.tvLevel4);
        tvLevel5=(TextView) findViewById(R.id.tvLevel5);
        //getting value from shared preferences
        SharedPreferences sp= getSharedPreferences(getString(R.string.answer_preferences), MODE_PRIVATE);
        String ansStr1= sp.getString("answered"+1,"");
        String ansStr2= sp.getString("answered"+2,"");
        String ansStr3= sp.getString("answered"+3,"");
        String ansStr4= sp.getString("answered"+4,"");
        String ansStr5= sp.getString("answered"+5,"");

        int lockRes=R.drawable.lock;
        //splilt every answered variables
        try{
            ansStrArr1 = ansStr1.split(",");
            ansStrArr2 = ansStr2.split(",");
            ansStrArr3 = ansStr3.split(",");
            ansStrArr4 = ansStr4.split(",");
            ansStrArr5 = ansStr5.split(",");

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
if(ansStr1.equals("")){tvLevel1.setText("0 out of 21 Logos solved");}
            else{
            tvLevel1.setText(ansStrArr1.length+" out of 21 Logos solved");}
            if(ansStr2.equals("")){tvLevel2.setText("0 out of 21 Logos solved");}
            else{
            tvLevel2.setText(ansStrArr2.length+" out of 21 Logos solved");}
            if(ansStr3.equals("")){tvLevel3.setText("0 out of 21 Logos solved");}
            else{
            tvLevel3.setText(ansStrArr3.length+" out of 21 Logos solved");}
            if(ansStr4.equals("")){tvLevel4.setText("0 out of 21 Logos solved");}
            else{
            tvLevel4.setText(ansStrArr4.length+" out of 21 Logos solved");}
            if(ansStr5.equals("")){tvLevel5.setText("0 out of 21 Logos solved");}
            else{
            tvLevel5.setText(ansStrArr5.length+" out of 21 Logos solved");}
        }
        catch (Exception e){
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
            tvLevel1.setText(0+" out of 21 Logos solved");
            tvLevel2.setText(0+" out of 21 Logos solved");
            tvLevel3.setText(0+" out of 21 Logos solved");
            tvLevel4.setText(0+" out of 21 Logos solved");
            tvLevel5.setText(0+" out of 21 Logos solved");
        }

    }
public void showLevel1(View v){
    switch (v.getId()){
        case R.id.btnLevel1:
    Intent i1= new Intent(this,Level1Activity.class);
    Bundle b1= new Bundle();
    b1.putIntArray("question",ques1);
    b1.putSerializable("answer",ansListL1);
    b1.putInt("level",1);
    i1.putExtras(b1);
    startActivity(i1);
            finish();
            break;
        case R.id.btnLevel2:
            Intent i2= new Intent(this,Level1Activity.class);

            Bundle b2= new Bundle();
            b2.putIntArray("question",ques2);
//            b2.putStringArray("answer",ans2);
            b2.putSerializable("answer",ansListL2);
            b2.putInt("level",2);
            i2.putExtras(b2);
            startActivity(i2);
            finish();
            break;
        case R.id.btnLevel3:
            Intent i3= new Intent(this,Level1Activity.class);
            Bundle b3= new Bundle();
            b3.putIntArray("question",ques3);
            //b3.putStringArray("answer", ans3);
            b3.putSerializable("answer",ansListL3);
            b3.putInt("level",3);
            i3.putExtras(b3);
            startActivity(i3);
            finish();
            break;
        case R.id.btnLevel4:
            Intent i4= new Intent(this,Level1Activity.class);
            Bundle b4= new Bundle();
            b4.putIntArray("question",ques4);
            //b4.putStringArray("answer", ans4);
            b4.putSerializable("answer",ansListL4);
            b4.putInt("level",4);
            i4.putExtras(b4);
            startActivity(i4);
            finish();
            break;
        case R.id.btnLevel5:
            Intent i5= new Intent(this,Level1Activity.class);
            Bundle b5= new Bundle();
            b5.putIntArray("question",ques5);
            //b5.putStringArray("answer", ans5);
            b5.putSerializable("answer",ansListL5);
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


}
