package com.bl.foodDelivery.View;

import com.bl.foodDelivery.Controller.Application;
import com.bl.foodDelivery.Model.FoodItem;

import java.util.List;
import java.util.Scanner;

//View Layer

public class DrivenInterface {
    private static final String Taste = null;

    public void print(List<FoodItem> foodList) {
        for (FoodItem foodItem : foodList) {
            System.out.println(foodItem);
        }
    }
    public void showUserMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********************************\n       Food Delivery System \n**********************************\n");
        boolean flag=true;
        Application application = new Application();
        while (flag) {
            System.out.print("1. To add an item. \n2. To remove an item. \n3. Print the menu. \n4. To exit\nEnter your choice:  ");
           int num = sc.nextInt();
           flag = application.handleUserSelection(num);
        }
    }
    public FoodItem addItem() {
        FoodItem foodItem = new FoodItem();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Item Name: ");
        foodItem.itemName = sc.nextLine();

        System.out.print("Enter Taste: \n1. For Spicy. \n2. For Sweet. \n3. For Sour. \n4. For Sweet-Sour\n====>> ");
        int tasteChoice = sc.nextInt();
        switch (tasteChoice) {
            case 1 -> foodItem.setTaste(FoodItem.Taste.SPICY);
            case 2 -> foodItem.setTaste(FoodItem.Taste.SWEET);
            case 3 -> foodItem.setTaste(FoodItem.Taste.SOUR);
            case 4 -> foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
            default -> System.out.println("plz enter correct choice........");
        }
        System.out.print("Enter category type: \n1. Starter. \n2. For Main Course. \n3. For Beverages \n====>> ");
        int categoryChoice = sc.nextInt();
        switch (categoryChoice) {
            case 1 -> foodItem.setCategory(FoodItem.Category.STARTER);
            case 2 -> foodItem.setCategory(FoodItem.Category.MAIN_COURSE);
            case 3 -> foodItem.setCategory(FoodItem.Category.BEVERAGES);
            default -> System.out.println("plz enter correct choice........");
        }
        System.out.print("Enter the Type: \n1. for Veg type. \n2. for NonVeg Type\n====>> ");
        int type = sc.nextInt();
        switch (type) {
            case 1 -> foodItem.setType(FoodItem.VegType.Veg);
            case 2 -> foodItem.setType(FoodItem.VegType.Non_Veg);
            default -> System.out.println("plz enter correct choice........");
        }
        System.out.print("Enter Price: Rs.");
        int price = sc.nextInt();
        foodItem.setPrice(price);
        System.out.println("\n success!!!Food item Inserted .......\n");

        return foodItem;
    }
}