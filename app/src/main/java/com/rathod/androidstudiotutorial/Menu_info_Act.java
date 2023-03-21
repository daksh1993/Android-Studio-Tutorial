package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Menu_info_Act extends AppCompatActivity {
    TextView textView,textView1,textView3, textView5;
    ImageView back;

    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_info);
        textView = findViewById(R.id.tView);
        textView1 = findViewById(R.id.tView1);
        textView3 = findViewById(R.id.tView2);
        back = findViewById(R.id.back);
        imageView=findViewById(R.id.imageView);
        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Menu_info_Act.this, Basic_act.class);

                startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
        InputStream inputStream = this.getResources().openRawResource(R.raw.menu_1);

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

        InputStream inputStream1 = this.getResources().openRawResource(R.raw.menu_2)
                ;

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


        InputStream inputStream2 = this.getResources().openRawResource(R.raw.menu_3);

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




    }



    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }




    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 10.0f));
            imageView.setScaleX(mScaleFactor);
            imageView.setScaleY(mScaleFactor);
            return true;
        }
    }
    public void onBackPressed() {
        Intent abc  = new Intent(Menu_info_Act.this, Basic_act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}