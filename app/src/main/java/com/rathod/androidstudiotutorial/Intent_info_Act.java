package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Intent_info_Act extends AppCompatActivity {
    TextView tv, tv1;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_info);

        tv = findViewById(R.id.tv1);
        tv1 = findViewById(R.id.tv2);
        back = findViewById(R.id.back);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Intent_info_Act.this, Basic_act.class);
                startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);

            }
        });
    }

    public void onBackPressed() {
        Intent abc  = new Intent(Intent_info_Act.this, Basic_act.class);

        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);



    }
}