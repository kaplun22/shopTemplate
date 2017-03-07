package com.internetShopProject.domain;

import com.internetShopProject.DAOLayer.GoodDAO;

public class Main {

    public static void main(String[] args) {

Good good = new Good();
        good.setName("GTX 1080");
        good.setPrice(15000);
        GoodDAO.create(good.getName(),good.getPrice());
    }
}
