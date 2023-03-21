package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.checkerframework.checker.units.qual.C;

public class Simple_Act extends AppCompatActivity {

    CardView manifest_btn;
    CardView and_archi;
    CardView toast_btn;
    ImageView back;
    CardView drawable_btn;
    CardView values_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        manifest_btn = findViewById(R.id.manifest_btn);

        toast_btn = findViewById(R.id.toast_btn);
        and_archi = findViewById(R.id.android_architecture_btn);
        drawable_btn = findViewById(R.id.drawable_btn);
        back = findViewById(R.id.back);
        values_btn = findViewById(R.id.values_btn);

        manifest_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent manifest = new Intent(Simple_Act.this, Manifest_info_Act.class);
                startActivity(manifest);

                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);


            }
        });

        toast_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toast = new Intent(Simple_Act.this, Toast_info_Act.class);
                startActivity(toast);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }

        });


        and_archi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent and = new Intent(Simple_Act.this, Android_Architecture_Act.class);
                startActivity(and);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });

         back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Simple_Act.this, MainActivity2.class);

                startActivity(back);

                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);

            }
        });

        drawable_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drawable_bbtn = new Intent(Simple_Act.this, drawable_act.class);
                startActivity(drawable_bbtn);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });


        values_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent values = new Intent(Simple_Act.this, Values_info_Act.class);
                startActivity(values);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });

    }


    public void onBackPressed() {
        Intent abc  = new Intent(Simple_Act.this, MainActivity2.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);


    }
}