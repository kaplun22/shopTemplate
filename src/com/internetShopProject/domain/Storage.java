package com.internetShopProject.domain;

import java.util.ArrayList;

/**
 * Created by Андрій on 02.03.2017.
 */
public class Storage {
    public  Goods cell;
    public ArrayList<Goods> cells;

    public Goods getCell() {
        return cell;
    }

    public void setCell(Goods cell) {
        this.cell = cell;
    }

    public void addGoodsToStorage(Goods goods ){

        this.cells.add(goods);
    }
    public void removeGoodsFromStorage(Goods goods ){

        this.cells.remove(goods);

    }


}

