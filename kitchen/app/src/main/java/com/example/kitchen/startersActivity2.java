package com.example.kitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class startersActivity2 extends AppCompatActivity {
ListView startersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters2);
        startersListView = findViewById(R.id.starters_list);

        Dish [] starterDishes = {
                new Dish("Crab and peppercorn dumplings",
                        "Thin filo pastry cases stuffed with acorn squash and garam masala\n",
                        1000),
                new Dish("Pork and basil soup",
                        "A rich jam made from fresh pommel and mulberry\n",
                        5000),
                new Dish("Egg and cucumber maki",
                        "Fresh egg pasta in a sauce made from spicy sausage and fresh rocket \n",
                        800),
                new Dish("Black pepper and coconut soup",
                        "Crunchy stir fry featuring fresh arugula and oregano\n",
                        659),
                new Dish("Chicken and parsnip soup",
                        "Crumbly muffins made with fresh raspberry and pecan\n",
                        710)

        };
        //array list
        String[] dishes =  {
                "Crab and peppercorn dumplings",
                "Chicken and parsnip soup",
                "Black pepper and coconut soup",
                "Pork and basil soup",
                "Spinach and coriander dumplings",
                "Egg and cucumber maki",
                "Trout and ham soup",
                "Cod and coriander parcels",
                "Celeriac and cheese dumplings",
                " Cheese and crab soup",
                "Mustard and celeriac soup",
                "Haddock and cucumber soup",
                "Tofu and cucumber uramaki",
                "Tamarind and rice soup",
                "Avocado and aubergine sushi",
                "Salmon and fish dumplings",
                "Artichoke and lime soup",
                "Cheese and chicken mousse",
                "Fish and tofu parcels",
                "Sweetcorn and veal dumplings"
        };

        // array adapter
        ArrayAdapter<Dish> dishesAdapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1,
                        starterDishes
                        );
        startersListView.setAdapter(dishesAdapter);



    }
}