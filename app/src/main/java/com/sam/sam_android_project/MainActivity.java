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

        projectListRecyclerView = findViewById(R.id.recycler_view);

        Project[] myProject = {
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.brt),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
                new Project("happy birthday",
                        "happy happy birthday samy sam sam sam sam sam",
                        R.drawable.ic_launcher_background),
        };



        ProjectAdapter projectAdapter = new ProjectAdapter(myProject);


        projectListRecyclerView.setAdapter(projectAdapter);
    }
}