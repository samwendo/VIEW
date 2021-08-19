package com.sam.sam_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project[] myProject = {
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",

                        R.drawable.happy_birthday_app_image

        )
        };
    }
}