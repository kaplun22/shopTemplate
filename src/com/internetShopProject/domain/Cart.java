package com.internetShopProject.domain;

import java.util.ArrayList;

/**
 * Created by Андрей on 02.03.2017.
 */
public class Cart {

    private static Goods items;
    public static ArrayList<Goods> goodsList;
    private static  Customer customer;
    private long actionTime;



   public void  addGoodsToList(){

       goodsList.add(items);

   }

    public void  removeGoodsFromList(){

        goodsList.remove(items);

    }


    public static Goods getItems() {
        return items;
    }

    public static void setItems(Goods items) {
        Cart.items = items;
    }

    public static Customer getCustomer() {
        return customer;
    }

    public static void setCustomer(Customer customer) {
        Cart.customer = customer;
    }

    public static ArrayList<Goods> getGoodsList() {
        return goodsList;
    }

    public static void setGoodsList(ArrayList<Goods> goodsList) {
        Cart.goodsList = goodsList;
    }

    public long getActionTime() {
        return actionTime;
    }

    public void setActionTime(long actionTime) {
        this.actionTime = actionTime;
    }
}
