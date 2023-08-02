package br.com.pa.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getDishes());

        startersList.setAdapter(dishesAdapter);
    }

    private Dish[] getDishes() {
        String[] disheNames = {
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
                "Caesar Salad"
        };

        Dish[] dishes = new Dish[20];

        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int randomPrice = random.nextInt(200);
            String gptGenericDishDescription;

            if (randomPrice < 50) {
                gptGenericDishDescription = "Savor the delight of a delectable fusion of flavors and textures, offering a harmonious balance of taste in every bite.";
            } else if (randomPrice < 100) {
                gptGenericDishDescription = "Indulge in a culinary masterpiece of succulent meats, vibrant vegetables, and rich sauces, harmoniously crafted to create an unforgettable dining experience.";
            } else if (randomPrice < 150) {
                gptGenericDishDescription = "Experience a symphony of flavors with a skillfully prepared dish that combines the finest ingredients, expert techniques, and a touch of culinary artistry.";
            } else {
                gptGenericDishDescription = "Delight in a culinary journey that tantalizes the taste buds with a fusion of exotic spices, fresh ingredients, and creative presentations, leaving a lasting impression on every palate.";
            }

            dishes[i] = new Dish(disheNames[i], gptGenericDishDescription, randomPrice);
        }

        return dishes;
    }
}