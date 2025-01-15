package com.example.sgrtickets;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Dashboard extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
       setContentView (R.layout.activity_dashboard);
       bottomNavigation = findViewById (R.id.bottomNavigationView);

       replaceFragment (new Home ());
       bottomNavigation.setOnItemSelectedListener (item -> {
           if (item.getItemId () == R.id.home) {
               replaceFragment (new Home ());
           } else if (item.getItemId () == R.id.bookmark) {
               replaceFragment (new Bookmark ());
           } else if (item.getItemId () == R.id.location) {
               replaceFragment (new Location ());
           }else if (item.getItemId () == R.id.account){
               replaceFragment (new Account ());
           }
           return true;
       });
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, fragment);
        fragmentTransaction.commit();
    }
}

