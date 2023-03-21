package com.rathod.androidstudiotutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SQlite_database_info extends AppCompatActivity {
    TextView tv, tv1, tv2,tv3;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_database_info);
        tv = findViewById(R.id.create_tv);
        tv1 = findViewById(R.id.read_tv);
        tv2 = findViewById(R.id.update_tv);
        tv3 = findViewById(R.id.delete_tv);
        back = findViewById(R.id.back);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SQlite_database_info.this, Advance_Act.class);
                startActivity(back);
                finish();
                overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
            }
        });
    }

    public void onBackPressed() {
        Intent abc  = new Intent(SQlite_database_info.this, Advance_Act.class);
        startActivity(abc);
        finish();
        overridePendingTransition(R.anim.slide_right_back,R.anim.slide_left_back);
    }
}