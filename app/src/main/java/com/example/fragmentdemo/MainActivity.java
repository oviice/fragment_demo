package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         manager = getSupportFragmentManager();


        Button home=findViewById(R.id.home);
        Button secondBtn=findViewById(R.id.second);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HomeFragment homeFragment=new HomeFragment();
                transaction = manager.beginTransaction();
                transaction.add(R.id.layout, homeFragment, "HomeFrag").commit();

            }
        });

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment=new SecondFragment();
                transaction = manager.beginTransaction();
                transaction.replace(R.id.layout,secondFragment,"SEcond").commit();
            }
        });
    }
}