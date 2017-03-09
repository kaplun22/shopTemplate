package com.internetShopProject.DAOLayer;

import com.internetShopProject.domain.Good;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Андрій on 07.03.2017.
 */
public class GoodDAO {
    private static Logger logger = Logger.getLogger(GoodDAO.class.getName());
    public static void create(String name, int price){
       Connection con = null;
        PreparedStatement pr = null;

        try {
           con =  DBConnect.getConnectionToDB();

        String sql = "INSERT INTO \"goods\" (name, price) VALUES(?,?)";
            pr = con.prepareStatement(sql);
            pr.setString(1,name);
            pr.setInt(2,price);
            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                if(pr!=null){
                pr.close();}
                if(con !=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }



    }
    public static Good getGood(String name,int price){
        Good good = new Good();
        Connection con = null;
        ResultSet rSet = null;
        try {
            con = DBConnect.getConnectionToDB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql = "SELECT * FROM \"goods\" WHERE price='"+name+"'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rSet = ps.executeQuery();
           if(rSet.wasNull()) {
               while (rSet.next()) {

               }
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return good;

    }


}
