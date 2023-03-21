package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Act_Info extends AppCompatActivity {


    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_info);
        back = findViewById(R.id.back);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bac = new Intent(Act_Info.this, Basic_act.class);
                startActivity(bac);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
    }
    public void onBackPressed() {
        Intent abc  = new Intent(Act_Info.this, Basic_act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}