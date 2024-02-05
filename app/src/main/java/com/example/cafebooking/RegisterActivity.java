package com.example.cafebooking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
     EditText etName, etMail,etNumber, etPassword;
     Button btnRegister;
     TextView tvLogin;
     FirebaseAuth frAuth;

     Firebase firebase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Firebase.setAndroidContext(this);
        firebase = new Firebase("https://cafebooking-46d00.firebaseio.com/");

        etName = findViewById(R.id.etName);
        etMail = findViewById(R.id.etMail);
        etNumber = findViewById(R.id.etNumber);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);

        frAuth = FirebaseAuth.getInstance();

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final String name, number, mail, password;
                name = etName.getText().toString().trim();
                number = etNumber.getText().toString().trim();
                mail = etMail.getText().toString().trim();
                password = etPassword.getText().toString().trim();

                if(name.isEmpty() || number.isEmpty() || mail.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                 frAuth.createUserWithEmailAndPassword(mail,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if(task.isSuccessful())
                         {
                             Toast.makeText(RegisterActivity.this, "Registration Successful!",Toast.LENGTH_SHORT).show();
                             startActivity(new Intent(RegisterActivity.this, MainActivity.class));


                             Firebase dFirebase = firebase.child("Users");
                             Firebase frName = dFirebase.child("Name");
                             frName.setValue(name);

                             Firebase frNumber = dFirebase.child("Number");
                             frNumber.setValue(number);

                             Firebase frMail = dFirebase.child("Mail");
                             frMail.setValue(mail);

                             Firebase frPassword = dFirebase.child("Password");
                             frPassword.setValue(password);


                         }
                         else
                         {
                             Toast.makeText(RegisterActivity.this, "Registration UnSuccessful!", Toast.LENGTH_SHORT).show();
                         }
                     }
                 });
                }
            }
        });


    }
}
