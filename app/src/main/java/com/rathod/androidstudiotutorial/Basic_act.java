package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Basic_act extends AppCompatActivity {

    CardView act, proj, layout, wid, frag, menu, intent, intro;

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic);

        //<editor-fold desc = "Find View By ID">
        back = findViewById(R.id.back);
        act = findViewById(R.id.activit_btn);
        proj = findViewById(R.id.project_struc_btn);
        layout = findViewById(R.id.layout_btn);
        wid = findViewById(R.id.widget_btn);
        menu = findViewById(R.id.menu_btn);
        intent = findViewById(R.id.intent_btn);
        intro = findViewById(R.id.and_stu_info_btn);
//</editor-fold>

        //<editor-fold desc = "On Click Listener">

        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Basic_act.this, Intro_avd.class);
                startActivity(abc);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });


        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(Basic_act.this, Intent_info_Act.class);
                startActivity(abc);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ay = new Intent(Basic_act.this, Menu_info_Act.class);
                startActivity(ay);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });


//        frag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent ay = new Intent(Basic_act.this, Frag_Act.class);
//                startActivity(ay);
//            }
//        });


        wid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lay = new Intent(Basic_act.this, Widgets_Act.class);
                startActivity(lay);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lay = new Intent(Basic_act.this, Layout_Act.class);
                startActivity(lay);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });


        proj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(Basic_act.this, Project_Structures_Act.class);
                startActivity(pro);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });

        act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act = new Intent(Basic_act.this, Act_Info.class);
                startActivity(act);
                overridePendingTransition(R.anim.slide_right, R.anim.slide_left);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Basic_act.this, MainActivity2.class);

                //go back animation

                startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back, R.anim.slide_left_back);


            }
        });

        //</editor-fold>


    }


    public void onBackPressed() {
        Intent abc = new Intent(Basic_act.this, MainActivity2.class);

        startActivity(abc);

        finish();

        overridePendingTransition(R.anim.slide_right_back, R.anim.slide_left_back);

    }
}