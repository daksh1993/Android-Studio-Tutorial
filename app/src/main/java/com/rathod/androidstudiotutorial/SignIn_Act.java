package com.rathod.androidstudiotutorial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignIn_Act extends AppCompatActivity {
    private EditText emailTextView, passwordTextView,name,number;
    private TextView Btn;
    private ProgressBar progressbar;
    private FirebaseAuth mAuth;
    FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        name = findViewById(R.id.name_edt);
        number = findViewById(R.id.number_edt);
        emailTextView = findViewById(R.id.email_edt);
        passwordTextView = findViewById(R.id.pass_edt);
        Btn = findViewById(R.id.regis_btn);
        progressbar = findViewById(R.id.progressbar);
        mAuth = FirebaseAuth.getInstance();

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerNewUser();
            }
        });
    }
    private void registerNewUser() {

        progressbar.setVisibility(View.VISIBLE);

        String email, password,names,numbers;
        names = name.getText().toString().trim();
        numbers= number.getText().toString().trim();
        email = emailTextView.getText().toString().trim();
        password = passwordTextView.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            Toast.makeText(getApplicationContext(),
                            "Please enter email!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(),
                            "Please enter password!!",
                            Toast.LENGTH_LONG)
                    .show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(),
                                            "Registration successful!",
                                            Toast.LENGTH_LONG)
                                    .show();

                            progressbar.setVisibility(View.GONE);

                            Intent intent
                                    = new Intent(SignIn_Act.this,
                                    Login_Act.class);
                            startActivity(intent);


                            firebaseFirestore.collection("User")
                                    .document(FirebaseAuth.getInstance().getUid())
                                    .set(new UserModal(names,numbers,email));




                        } else {

                            Toast.makeText(
                                            getApplicationContext(),
                                            "Registration failed!!"
                                                    + " Please try again later",
                                            Toast.LENGTH_LONG)
                                    .show();

                            // hide the progress bar
                            progressbar.setVisibility(View.GONE);
                        }
                    }
                    });
    }

    }
