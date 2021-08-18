package com.example.kitchen;

public class Dish {
    String title;
    String description;
    int price;

    public Dish(String title, String description, int price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + "\n" + description + "\n" + price;
    }
}
