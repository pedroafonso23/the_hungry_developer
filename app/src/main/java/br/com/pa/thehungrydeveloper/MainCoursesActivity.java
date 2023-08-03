package br.com.pa.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {
    Utils utils = new Utils();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = getMainDishes();

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

        mainCoursesList.setAdapter(dishesAdapter);
    }

    private Dish[] getMainDishes() {
        String[] mainDishNames = {
                "Butterbeer",
                "Lembas Bread",
                "Roast Beast",
                "Krabby Patty",
                "Nuka-Cola",
                "Slurm",
                "Romulan Ale",
                "Fruity Oaty Bars",
                "Big Kahuna Burger",
                "Stay Puft Marshmallows",
        };

        return utils.createDishes(mainDishNames);
    }
}
