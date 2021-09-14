package com.bl.foodDelivery.Model;

import java.util.ArrayList;
import java.util.List;

//Data Layer/ Model Layer
public class FoodStore {
    public static FoodStore single_instance = null;

    private FoodStore() {
    }

    public static synchronized FoodStore getInstance() {
        if (single_instance == null)
            single_instance = new FoodStore();
        return single_instance;
    }

    List<FoodItem> foodList = new ArrayList<>();

    public void add(FoodItem foodItem) {
        foodList.add(foodItem);
    }

    public void remove(FoodItem foodItem) {
        foodList.remove(foodItem);
        System.out.println("\nDeleted.......\n");
    }

    public List<FoodItem> getFoodList() {
        return foodList;
    }

    public FoodItem getFoodItem(String foodName) {
        for (FoodItem foodItem : foodList) {
            if (foodName.equals(foodItem.itemName)) {
                return foodItem;
            }
        }
        return null;
    }
}