package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Manifest_info_Act extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifest_info);

        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent back = new Intent(Manifest_info_Act.this, Simple_Act.class);

                startActivity(back);

                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });

    }

    public void onBackPressed() {
        Intent abc  = new Intent(Manifest_info_Act.this, Simple_Act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}