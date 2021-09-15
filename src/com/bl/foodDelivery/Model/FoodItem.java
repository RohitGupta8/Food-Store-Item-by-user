package com.bl.foodDelivery.Model;


import java.util.Objects;

public class FoodItem {
    public enum Taste {SOUR, SWEET, SPICY, SWEET_SOUR};
    public enum Category {STARTER, MAIN_COURSE, BEVERAGES};
    public enum VegType {Veg, Non_Veg};

    public String itemName;
    public Taste taste;
    public Category category;
    public VegType vegType;
    public int price;

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public void setTaste(Taste tasteChoice) {
        this.taste = tasteChoice;
    }
    public void setCategory(Category categoryChoice) {
        this.category = categoryChoice;
    }
    public void setType(VegType type) {
        this.vegType = type;
    }
    @Override
    public String toString() {
        return "============================\n"+"Item Name = " + itemName +"\nTaste = " + taste + "\nCategory = " + category + "\nType = " + vegType + "\nPrice = Rs." + price+"/-\n===========================\n";
    }



    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }
}
