package com.logoq.user.logoq;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;


public class GameActivity extends Activity {
    Button btnCheck;
    ImageView ivQues;
    EditText etxtAns;
    String plrAns;
    int min=0, max=26, rdmInt;
    String[] ans= {"aircel", "airindia", "airtel", "amul", "asian paints", "bsnl", "dabur", "dlf", "eicer", "force", "hp", "icici",
            "lic", "mahindra", "micromax", "myntra.com", "nestle", "sbi", "suzuki", "tata", "telenor", "thumbsup",
            "tvs", "unilever", "videocon", "vodafon","wipro"};
    int[] ques = {R.drawable.q11, R.drawable.q12, R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q110,R.drawable.q111,R.drawable.q12,
            R.drawable.q13,R.drawable.q14,R.drawable.q15,R.drawable.q16,R.drawable.q17,R.drawable.q18,R.drawable.q19,R.drawable.q210,R.drawable.q21,R.drawable.q22,R.drawable.q23,R.drawable.q24,R.drawable.q25,R.drawable.q26,R.drawable.q27};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        btnCheck= (Button) findViewById(R.id.btnCheck);
        ivQues= (ImageView) findViewById(R.id.ivQues);
        etxtAns= (EditText) findViewById(R.id.etxtAns);

        ivQues.setImageDrawable(null);
        Random r = new Random();
        rdmInt= r.nextInt(max-min+1)+min;
        ivQues.setBackgroundResource(ques[rdmInt]);
        //plrAns = etxtAns.getText().toString().toLowerCase();

    }
    public void checkAns(View v){
        plrAns = etxtAns.getText().toString().toLowerCase();
        if (plrAns.equals(ans[rdmInt])){

            Toast.makeText(GameActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
            finish();
        }
        else{
            Toast.makeText(GameActivity.this,"Wrong Answer Try Again",Toast.LENGTH_SHORT).show();
        }



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
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
