package com.sam.nav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import meow.bottomnavigation.MeowBottomNavigation;


public class MainActivity extends AppCompatActivity {

    private int ID_HOME = 1;
    private int ID_MASSGE = 2;
    private int ID_NOTIFICATIONS = 3;
    private int ID_ACCOUNTS = 4;
    TextView selectedText;
    MeowBottomNavigation bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedText = findViewById(R.id.text_view_selected_text);
        bottomNav  =  findViewById(R.id.nav_bottom);


        bottomNav.add(new MeowBottomNavigation.Model(ID_HOME,
                R.drawable.ic_home));
        bottomNav.add(new MeowBottomNavigation.Model(ID_MASSGE,
                R.drawable.ic_message));
        bottomNav.add(new MeowBottomNavigation.Model(ID_NOTIFICATIONS,
                R.drawable.ic_notifications));
        bottomNav.add(new MeowBottomNavigation.Model(ID_ACCOUNTS,
                R.drawable.ic_account));

        bottomNav.setOnClickListener(new MeowBottomNavigation.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "niaje",
                Toast.LENGTH_LONG).show();
            }
        });

//        bottomNav.setOnShowListener(new MeowBottomNavigation.OnShowListener(){
//            @Override
//            public void onShow(View v){
//                Toast.makeText(MainActivity.this, "hello",
//                        Toast.LENGTH_LONG).show();
//            }
//        });


    }


}