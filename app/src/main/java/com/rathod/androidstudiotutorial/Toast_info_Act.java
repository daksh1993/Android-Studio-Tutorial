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

public class Toast_info_Act extends AppCompatActivity {
    ImageView back;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_info);

        back = findViewById(R.id.back);


        textView = findViewById(R.id.tView);

        InputStream inputStream = this.getResources().openRawResource(R.raw.demo);

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








        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Toast_info_Act.this, Simple_Act.class);

                startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
    }
    public void onBackPressed() {
        Intent abc  = new Intent(Toast_info_Act.this, Simple_Act.class);

        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}