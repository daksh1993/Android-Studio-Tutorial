package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Advance_Act extends AppCompatActivity {
    ImageView back;
    CardView async, shred,gmap,sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        back = findViewById(R.id.back);
        async = findViewById(R.id.async_btn);
        shred = findViewById(R.id.shared_preference_btn);
        gmap = findViewById(R.id.Gmap_btn);
        sqlite = findViewById(R.id.sqlite_database_btn);


        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abd = new Intent(Advance_Act.this, SQlite_database_info.class);
                startActivity(abd);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });


        gmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abd = new Intent(Advance_Act.this, Google_api_Act.class);
                startActivity(abd);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });


        shred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Advance_Act.this, Shared_preference_Act.class);
                startActivity(back);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });


        async.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Advance_Act.this, Async_task_Act.class);
                startActivity(back);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Advance_Act.this, MainActivity2.class);
                startActivity(back);
            finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);

            }
        });
    }
    public void onBackPressed() {
        Intent abc  = new Intent(Advance_Act.this, MainActivity2.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);


    }
}