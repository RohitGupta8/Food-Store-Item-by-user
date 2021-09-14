package com.bl.foodDelivery.Controller;

import com.bl.foodDelivery.Model.FoodItem;
import com.bl.foodDelivery.Model.FoodStore;
import com.bl.foodDelivery.View.DrivenInterface;

import java.util.Scanner;

//Controller Layer

public class Application {
    static DrivenInterface drivenInterface = new DrivenInterface();

    public static void main(String[] args) {
        drivenInterface.showUserMenu();
    }

    public boolean handleUserSelection(int num) {
        FoodStore foodStore = FoodStore.getInstance();

        switch (num) {
            case 1 -> {
                FoodItem foodItem = drivenInterface.addItem();
                foodStore.add(foodItem);
            }
            case 2 -> {
                System.out.println("Enter the name which you want to remove: ");
                String name = new Scanner(System.in).nextLine();
                foodStore.remove(new FoodItem(name));
            }
            case 3 -> {
                System.out.println("\n********** MENU *************");
                drivenInterface.print(foodStore.getFoodList());
                System.out.println("********** MENU End *************\n");
            }
            case 4 -> {
                System.out.println("\nThanks for Visiting.........");
                return false;
            }
            default -> System.out.println("plz enter correct choice........");
        }
        return true;
    }
}
