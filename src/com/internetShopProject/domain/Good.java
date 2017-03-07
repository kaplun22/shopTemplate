package com.internetShopProject.domain;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Good {
    private   String Name;
    private  int price;
    private int goodID;


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

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }
}
