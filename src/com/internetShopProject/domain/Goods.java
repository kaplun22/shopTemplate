package com.internetShopProject.domain;

import java.util.ArrayList;

/**
 * Created by Андрій on 02.03.2017.
 */
public class Goods {

    private Good good ;
    private ArrayList<Good> goods;

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public void addGood(Good good ){
        this.goods.add(good);

    }
    public void removeGood(Good good ){
        this.goods.remove(good);

    }
}
