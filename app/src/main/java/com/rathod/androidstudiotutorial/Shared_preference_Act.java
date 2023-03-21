package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Shared_preference_Act extends AppCompatActivity {
ImageView back;

    TextView textView,textView1,textView3, textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference_act);
        textView = findViewById(R.id.tView);

        textView1 = findViewById(R.id.tView1);
        textView3 = findViewById(R.id.tView3);
        textView5 = findViewById(R.id.tView5);
back = findViewById(R.id.back);


back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent abc  =new Intent(Shared_preference_Act.this,Advance_Act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
});

        InputStream inputStream = this.getResources().openRawResource(R.raw.shred1);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        StringBuffer stringBuffer = new StringBuffer();

        String strdata = "";


        if (inputStream != null){

            try {
                while ((strdata = bufferedReader.readLine()) != null){
                    stringBuffer.append( strdata + "\n");

                }

                textView.setText( stringBuffer);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


        InputStream inputStream1 = this.getResources().openRawResource(R.raw.shred2);

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1));

        StringBuffer stringBuffer1 = new StringBuffer();

        String strdata1 = "";


        if (inputStream1 != null){

            try {
                while ((strdata1 = bufferedReader1.readLine()) != null){
                    stringBuffer1.append( strdata1 + "\n");

                }

                textView1.setText( stringBuffer1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }







    InputStream inputStream2 = this.getResources().openRawResource(R.raw.shred3);

    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream2));

    StringBuffer stringBuffer2 = new StringBuffer();

    String strdata2 = "";


        if (inputStream2 != null){

                try {
                while ((strdata2 = bufferedReader2.readLine()) != null){
                stringBuffer2.append( strdata2 + "\n");

                }

                textView3.setText( stringBuffer2);
                } catch (Exception e) {
                e.printStackTrace();
                }
                }



        InputStream inputStream5 = this.getResources().openRawResource(R.raw.shred5);

        BufferedReader bufferedReader5 = new BufferedReader(new InputStreamReader(inputStream5));

        StringBuffer stringBuffer5 = new StringBuffer();

        String strdata5 = "";


        if (inputStream5 != null){

            try {
                while ((strdata5 = bufferedReader5.readLine()) != null){
                    stringBuffer5.append( strdata5 + "\n");

                }

                textView5.setText( stringBuffer5);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }






    }

    public void onBackPressed() {
        Intent abc = new Intent(Shared_preference_Act.this, Advance_Act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
                }