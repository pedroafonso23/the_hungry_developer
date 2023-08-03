package br.com.pa.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StartersActivity extends AppCompatActivity {
    Utils utils = new Utils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getStarterDishes());

        startersList.setAdapter(dishesAdapter);
    }

    private Dish[] getStarterDishes() {
        String[] startersDishNames = {
                "Spaghetti Bolognese",
                "Chicken Curry",
                "Margherita Pizza",
                "Beef Stir Fry",
                "Lemon Garlic Shrimp",
                "Beef Tacos",
                "Chicken Alfredo",
                "Vegetable Stir Fry",
                "Fish and Chips",
                "Eggplant Parmesan",
                "BBQ Ribs",
                "Pad Thai",
                "Caprese Salad",
                "Chicken Shawarma",
                "Beef Burger",
                "Chicken Noodle Soup",
                "Veggie Pizza",
                "Fried Rice",
                "Lasagna",
                "Caesar Salad",
        };

        return utils.createDishes(startersDishNames);
    }
}