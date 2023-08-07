package br.com.pa.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {
    Utils utils = new Utils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        ArrayAdapter<Dish> dessertsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getDessertDishes());

        dessertsList.setAdapter(dessertsAdapter);
    }

    private Dish[] getDessertDishes() {
        String[] dessertsDishNames = {
                "Everlasting Gobstopper",
                "Butterbeer Ice Cream",
                "Lembas Bread",
                "Pawpsicles",
                "Blue Milkshake",
                "Sugar Rush Cupcakes",
                "Melonpan",
                "Raktajino",
                "Voodoo Donuts",
                "Sweet Rolls",
        };

        return utils.createDishes(dessertsDishNames);
    }
}