package com.internetShopProject.DAOLayer;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Андрій on 07.03.2017.
 */
public class GoodDAO {
    private static Logger logger = Logger.getLogger(GoodDAO.class.getName());
    public static void create(String name, int price){
        try {
            Connection connect =  DBConnect.getConnectionToDB();
        } catch (Exception e) {
            logger.log(Level.SEVERE,"Connection isn`t succesfull");
        
        }

    }


}
