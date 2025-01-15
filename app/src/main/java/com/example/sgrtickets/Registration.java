package com.example.sgrtickets;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {
ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_authentication);

        progressDialog = new ProgressDialog (this);

        Button signin_btn = findViewById(R.id.navsignin);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})

        Button register_btn = findViewById(R.id.sigup_btn);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText phoneEditText = findViewById (R.id.phoneEditText);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText emailEditText = findViewById (R.id.emailEditText);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText fullnameEditText = findViewById (R.id.fullnameEditText);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText passwordEditText = findViewById (R.id.passwordEditText);


        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(phoneEditText.getText ().toString ().trim ().isEmpty ()){
                    phoneEditText.setError ("Please enter your  phone number");
                } else if (emailEditText.getText ().toString ().trim ().isEmpty ()) {
                    emailEditText.setError ("Please enter your email");

                } else if (fullnameEditText.getText ().toString ().trim ().isEmpty ()) {
                    fullnameEditText.setError ("Please enter your fullname");
                }else {

                    progressDialog.setTitle ("SGR Account");
                    progressDialog.setMessage ("Registering ......");
                    progressDialog.setCanceledOnTouchOutside (false);
                    progressDialog.show ();
                    loginPage();}
            }
        });

        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signinPage();
            }
        });

    }

    public void loginPage(){
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
    }
    public void signinPage(){
        Intent intent = new Intent(this,Signin.class);
        startActivity(intent);
    }
}