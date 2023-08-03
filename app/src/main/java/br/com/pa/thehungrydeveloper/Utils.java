package br.com.pa.thehungrydeveloper;

import java.util.Random;

public class Utils {

    public Dish[] createDishes(String[] dishNames) {
        int dishQuantity = dishNames.length;
        Dish[] dishes = new Dish[dishQuantity];

        for (int i = 0; i < dishQuantity; i++) {
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

            dishes[i] = new Dish(dishNames[i], gptGenericDishDescription, randomPrice);
        }

        return dishes;
    }
}
