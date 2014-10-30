package com.logoq.user.logoq;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.logoq.user.logoq.R;

import java.util.Arrays;

/**
 * Created by NPAHARI on 10/16/2014.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private int ques[],level;
    boolean temp = true;

    // Constructor
    public ImageAdapter(Context c, int qu[],int le) {
        mContext = c;
        ques = qu;
        level = le;
    }

    public int getCount() {
        return ques.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;


        ImageView imageView;
//        if (convertView == null) {
        imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        SharedPreferences sp = mContext.getSharedPreferences(mContext.getString(R.string.answer_preferences), Context.MODE_PRIVATE);
        String ansStr = sp.getString("answered"+level, "");
        String[] ansStrArr;
        try {
        ansStrArr = ansStr.split(",");


        for (int i = 0; i < (ansStrArr.length); i++) {

            temp = (position == Integer.parseInt(ansStrArr[i]));

            if (position == Integer.parseInt(ansStrArr[i])) {
                imageView.setAlpha(100);


            }
//            else {
//                imageView.setAlpha(100);
//                Log.e("opacity ghateko position", position+"");
//            }

            }
        } catch(Exception e){

        }


//        else {
//            imageView = (ImageView) convertView;
//      }

            imageView.setImageResource(ques[position]);

            return imageView;
        }



    }
