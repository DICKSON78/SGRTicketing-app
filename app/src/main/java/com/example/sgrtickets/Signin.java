package com.example.sgrtickets;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signin extends AppCompatActivity {
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button ForgotPassword = findViewById(R.id.forgotpassword);
        progressDialog = new ProgressDialog (this);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button signup_btn = findViewById(R.id.navsignup);

        Button login_btn = findViewById(R.id.sigin_btn);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText signemail = findViewById (R.id.signemail);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText signpassword = findViewById (R.id.signpassword);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signemail.getText ().toString ().trim ().isEmpty ()){
                    signemail.setError ("Email or Phone cannot be Empty");
                } else if (signpassword.getText ().toString ().trim ().isEmpty ()) {
                    signemail.setError ("Password cannot be Empty");

                } else {
                    progressDialog.setTitle ("Authentication");
                    progressDialog.setMessage ("Please wait ......");
                    progressDialog.setCanceledOnTouchOutside (false);
                    progressDialog.show ();
                    dashboardPanel();
                }

            }
        });

        ForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forgotPassword();
            }
        });

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpPage();
            }
        });

    }


  public void dashboardPanel(){
        Intent intent = new Intent(this,Dashboard.class);
        startActivity(intent);
  }

    public void forgotPassword(){
        Intent intent = new Intent(this,ForgotPasswaord.class);
        startActivity(intent);
    }

    public void signUpPage(){
        Intent intent = new Intent(this,Registration.class);
        startActivity(intent);
    }
}