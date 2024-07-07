package com.horidas.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

//    Button fragment1,fragment2;
    TabLayout tabLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);

        FragmentManager fManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fManager.beginTransaction();
        fragmentTransaction.add(R.id.host,new FirstFragment());
        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                 int tabPosition = tab.getPosition();
                 String tabText = tab.getText().toString();
                Toast.makeText(MainActivity.this,tabText,Toast.LENGTH_LONG).show();

                    if(tabPosition==0){
                            FragmentManager fManager = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                            fragmentTransaction.add(R.id.host,new FirstFragment());
                            fragmentTransaction.commit();
                    } else if (tabPosition==1) {
                            FragmentManager fManager = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                            fragmentTransaction.add(R.id.host,new SecondFragment());
                            fragmentTransaction.commit();
                    } else if (tabPosition==2) {
                            FragmentManager fManager = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fManager.beginTransaction();
                            fragmentTransaction.add(R.id.host,new FirstFragment());
                            fragmentTransaction.commit();
                    }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });








  //-----------fragment 1 & 2 --------------
//        fragment1 = findViewById(R.id.fragment1);
//        fragment2= findViewById(R.id.fragment2);
//
//        fragment1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fManager.beginTransaction();
//                fragmentTransaction.add(R.id.host,new FirstFragment());
//
//                fragmentTransaction.commit();
//            }
//        });
//
//        fragment2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fManager = getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fManager.beginTransaction();
//                fragmentTransaction.add(R.id.host,new SecondFragment());
//
//                fragmentTransaction.commit();
//            }
//        });

    }
}