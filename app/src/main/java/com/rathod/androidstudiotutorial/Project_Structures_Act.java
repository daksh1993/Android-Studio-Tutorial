package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Project_Structures_Act extends AppCompatActivity {
    ImageView back;

    TextView manifest_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_structures);
        back = findViewById(R.id.back);
//        manifest_btn  = findViewById(R.id.manifset_forward);

//        manifest_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent ne = new Intent(Project_Structures_Act.this , Manifest_info_Act.class);
//                startActivity(ne);
//            }
//        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Project_Structures_Act.this, Basic_act.class);
                startActivity(back);finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
    }
    public void onBackPressed() {
        Intent abc  = new Intent(Project_Structures_Act.this, Basic_act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}