package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;



public class OpenFirstScreen_Act extends AppCompatActivity {
//gesture for slide up
    private GestureDetectorCompat gdc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_first_screen);

        gdc = new GestureDetectorCompat(OpenFirstScreen_Act.this, new GestuerListener());

    }

    private class GestuerListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

            Intent i = new Intent(OpenFirstScreen_Act.this, MainActivity2.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);
            // animation from bottom to top
//            overridePendingTransition(R.anim.slide_in_up,R.anim.slide_out_up);


            Toast.makeText(
                            getApplicationContext(),
                            "Welcome",
                            Toast.LENGTH_LONG)
                    .show();
            return super.onFling(e1, e2, velocityX, velocityY);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gdc.onTouchEvent(event);

        return super.onTouchEvent(event);
    }
}