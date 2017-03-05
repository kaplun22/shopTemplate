package com.internetShopProject.domain;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Good {
    private   String Name;
    private  int price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
