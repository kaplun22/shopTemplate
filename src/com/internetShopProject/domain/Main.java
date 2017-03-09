package com.internetShopProject.domain;

import com.internetShopProject.DAOLayer.GoodDAO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

Good good = new Good();
       // good.setName("GTX 1080");
     //   good.setPrice(15000);
      //  GoodDAO.create("gtx 1080",15000,);

        Customer customer = new Customer();
        GregorianCalendar gc = new GregorianCalendar(1982,02,14);
        long timeInMils = gc.getTimeInMillis();
        customer.setBirthday(timeInMils);

    }
}
