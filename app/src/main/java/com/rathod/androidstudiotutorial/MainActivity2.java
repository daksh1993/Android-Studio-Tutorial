package com.rathod.androidstudiotutorial;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity2 extends AppCompatActivity {

    CardView Basic , simple , advance ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        simple = findViewById(R.id.simple_btn);
        Basic = findViewById(R.id.basic_btn);
        advance = findViewById(R.id.advanced_btn);


//        sign_Out = findViewById(R.id.sign_out);

//        sign_Out.setOnClickListener  (new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseAuth.getInstance().signOut();
//                Intent n = new Intent(MainActivity2.this,Login_Act.class);
//                startActivity(n);
//            }
//        });


        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent basic = new Intent(MainActivity2.this, Simple_Act.class);
                startActivity(basic);
                // go ahead animation
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });

        Basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent simple = new Intent(MainActivity2.this, Basic_act.class);
                startActivity(simple);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });

        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent advance = new Intent(MainActivity2.this, Advance_Act.class);
                startActivity(advance);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);

            }
        });

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            NotificationChannel channel = new NotificationChannel("MyNotification", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT);
//            NotificationManager manager = getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }

//        FirebaseMessaging.getInstance().subscribeToTopic("weather").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                String msg = "Successfull";
//                if (!task.isSuccessful()){
//                    msg = "failed";
//                }
//                Toast.makeText(MainActivity2.this,msg,Toast.LENGTH_LONG).show();
//            }
//        });
//
//
//    }




    }



//
//    public void onBackPressed() {
//        Intent a = new Intent(Intent.ACTION_MAIN);
//        a.addCategory(Intent.CATEGORY_HOME);
//        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(a);
//    }



    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            Intent a = new Intent(Intent.ACTION_MAIN);
     a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press Back again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
