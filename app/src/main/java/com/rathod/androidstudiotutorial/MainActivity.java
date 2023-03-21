package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView1;
    private ScaleGestureDetector scaleGestureDetector;
    private float mScaleFactor = 1.0f;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
        scaleGestureDetector = new ScaleGestureDetector(MainActivity.this, new ScaleListener());
        textView = findViewById(R.id.tView);

        textView1 = findViewById(R.id.tView1);


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


        InputStream inputStream1 = this.getResources().openRawResource(R.raw.demo);

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





    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        scaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }
    class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 10.0f));
            imageView.setScaleX(mScaleFactor);
            imageView.setScaleY(mScaleFactor);
            return true;
        }
    }
}
