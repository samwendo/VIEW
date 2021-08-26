package com.sam.samy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize bottom nav
        BottomNavigationView bottomNavigationView =
                findViewById(R.id.bottomNavigationView);
        //pass in the id of different fragments
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(
                        R.id.home2,
                        R.id.favorite,
                        R.id.search,
                        R.id.profile
                ).build();

        NavController navController =

                Navigation.findNavController(this,
                        R.id.fragmentContainerView);
        NavigationUI.setupActionBarWithNavController(this,
                navController,
                appBarConfiguration);

        NavigationUI.setupWithNavController(
                bottomNavigationView,
                navController
        );
    }
}