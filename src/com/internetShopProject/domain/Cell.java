package com.internetShopProject.domain;

/**
 * Created by Андрій on 07.03.2017.
 */
public class Cell {
   private int cellID;
   private String good;
   private int ammount;

    public int getCellID() {
        return cellID;
    }

    public void setCellID(int cellID) {
        this.cellID = cellID;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
}
