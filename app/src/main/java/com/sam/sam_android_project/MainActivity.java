package com.sam.sam_android_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.icu.text.CaseMap;
import android.os.Bundle;

import java.util.ListResourceBundle;

public class MainActivity extends AppCompatActivity {
RecyclerView projectListRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        projectListRecyclerView = findViewById(R.id.);

        Project[] myProject = {
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.download),
                new Project("Gift",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.hills_2836301_1920),
                new Project("BMI",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.north_cascades_national_park_lake_ann_park),

        };



        ProjectAdapter projectAdapter = new ProjectAdapter(myProject);


        projectListRecyclerView.setAdapter(projectAdapter);
    }
}