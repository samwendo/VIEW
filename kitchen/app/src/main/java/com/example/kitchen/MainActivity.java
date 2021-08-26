package com.example.kitchen;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView startrerCard;
    CardView mainCard;
    CardView DesertCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startrerCard = findViewById(R.id.card_starter);
        mainCard = findViewById(R.id.card_maine);
        DesertCard = findViewById(R.id.De_maine);

        startrerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent =
                        new Intent (MainActivity.this,
                                startersActivity2.class);
                startActivity(startersActivityIntent);

            }
        });
        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent =
                        new Intent (MainActivity.this,
                                maincouseActivity2.class);
                startActivity(startersActivityIntent);

            }
        });
        DesertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent =
                        new Intent (MainActivity.this,
                                DessertActivity2.class);
                startActivity(startersActivityIntent);

            }
        });

    }
}