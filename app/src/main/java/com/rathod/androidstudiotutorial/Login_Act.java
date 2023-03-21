package com.rathod.androidstudiotutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_Act extends AppCompatActivity {

    EditText email, pass;
    Button logIn_btn,reset_btn,singup;
    ProgressBar progressBar;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        singup = findViewById(R.id.orsignup);
        reset_btn = findViewById(R.id.forgot_pass);
        email = findViewById(R.id.email_log);
        pass = findViewById(R.id.password_log);
        logIn_btn = findViewById(R.id.login_btn);
        progressBar = findViewById(R.id.loading);

        logIn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = email.getText().toString();
                String s2 = pass.getText().toString();

                mAuth =FirebaseAuth.getInstance();

                mAuth.signInWithEmailAndPassword(s1,s2)
                       .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                           @Override
                           public void onComplete(@NonNull Task<AuthResult> task) {
                               if (task.isSuccessful()){
                                   
                                   Toast.makeText (Login_Act.this,"Login Successfull", Toast.LENGTH_LONG).show();


                                   FirebaseUser user1 = FirebaseAuth.getInstance().getCurrentUser();


                                   // Name, email address, and profile photo Url
                                   String name = user1.getDisplayName();
                                   String email = user1.getEmail();
                                   // The user's ID, unique to the Firebase project. Do NOT use this value to
                                   // authenticate with your backend server, if you have one. Use
                                   // FirebaseUser.getIdToken() instead.
                                   String uid = user1.getUid();

                                   Intent i = new Intent(Login_Act.this, MainActivity2.class);
                                   i.putExtra("name",name);
                                   i.putExtra("email",email);
                                   startActivity(i);




                               }else {

                                   Toast.makeText(
                                                   getApplicationContext(),
                                                   "Registration failed!!"
                                                           + " Please try again later",
                                                   Toast.LENGTH_LONG)
                                           .show();

                                   // hide the progress bar
                               }
                           }
                       });




            }

        });

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fs1 = email.getText().toString().trim();

                mAuth.sendPasswordResetEmail(fs1)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Login_Act.this, "Email Sent",Toast.LENGTH_LONG).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(Login_Act.this, "Fail",Toast.LENGTH_LONG).show();

                            }
                        });
            }
        });

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent o = new Intent(Login_Act.this,SignIn_Act.class);
                startActivity(o);
            }
        });
    }
}


/*
   progressBar.setVisibility(View.GONE);
                                Toast.makeText (Login_Act.this,"Login Successfull", Toast.LENGTH_LONG).show();;

                                Intent i = new Intent(Login_Act.this, MainActivity2.class);
                                startActivity(i);

 */