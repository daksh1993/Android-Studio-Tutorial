package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frag_Act extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent bac = new Intent(Frag_Act.this, MainActivity2.class);
                bac.putExtra("Check","1");
                    startActivity(bac);
                }
            });
        }
        public void onBackPressed() {
            Intent abc  = new Intent(Frag_Act.this, MainActivity2.class);
            abc.putExtra("Check","1");
            startActivity(abc);
        }
    }