package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Intro_avd extends AppCompatActivity {

    TextView tv;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_avd);
        tv = findViewById(R.id.as_link);
        back = findViewById(R.id.back);
        tv.setMovementMethod(LinkMovementMethod.getInstance());



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Intro_avd.this, Basic_act.class);

                startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
    }

    public void onBackPressed() {
        Intent abc  = new Intent(Intro_avd.this, Basic_act.class);

        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}