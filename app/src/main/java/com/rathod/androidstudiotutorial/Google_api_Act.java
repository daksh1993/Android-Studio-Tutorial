package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Google_api_Act extends AppCompatActivity {
    TextView tv;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_api);

        tv = findViewById(R.id.tv1);
        back = findViewById(R.id.back);

        tv.setMovementMethod(LinkMovementMethod.getInstance());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Google_api_Act.this, Advance_Act.class);
startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
    }

        public void onBackPressed() {
            Intent abc  = new Intent(Google_api_Act.this, Advance_Act.class);
            startActivity(abc);
            finish();
            overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
        }
    }