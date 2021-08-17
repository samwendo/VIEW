package com.example.kitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class startersActivity2 extends AppCompatActivity {
ListView startersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters2);
        startersListView = findViewById(R.id.starters_list);


    }
}