package com.example.sgrtickets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

     Button started = findViewById(R.id.started_btn);
     Button userAccount = findViewById(R.id.account_btn);

     userAccount.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Login();
         }
     });
     started.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            otpAuthentication();
         }
     });

    }


    public void otpAuthentication(){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

    public  void Login(){
        Intent intent = new Intent(this, Signin.class);
        startActivity(intent);
    }
}