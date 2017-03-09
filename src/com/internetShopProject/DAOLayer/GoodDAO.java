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
        public static void create(String name, int price, int goodId) {
            ;Connection con = null;
            PreparedStatement pStatement = null;
            Good goodInDB = null;
            goodInDB = getGood(name,price);
            if (goodInDB.getName()!=null){
                logger.log(Level.INFO,"This good exists in DB!");
                return;
            }
            try {
                con = new DBConnect().getConnectionToDB();
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Connection is not corect.");
            }
            String sql = "INSERT INTO \"Good\"(name,price,\"goodID\" )VALUES(?,?,?)";
            try {
                pStatement = con.prepareStatement(sql);
                pStatement.setString(1, name);
                pStatement.setInt(2, price);
                pStatement.setInt(3, goodId);
                pStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (pStatement != null) {
                        pStatement.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                }
            }
        }
        public static Good getGood(String name, int price) {
            Good good = new Good();
            Connection con = null;
            PreparedStatement pStatement = null;
            ResultSet rSet = null;
            try {
                con = DBConnect.getConnectionToDB();
            } catch (Exception e) {
            }
            String sql = "SELECT * FROM \"Goods\" WHERE name = '" + name + "'";
            try {
                pStatement = con.prepareStatement(sql);
                rSet = pStatement.executeQuery();
                while (rSet.next()){
                    good.setName(rSet.getString(2));
                    good.setPrice(rSet.getInt(3));
                    good.setGoodID(rSet.getInt("id"));
                }
            } catch (SQLException e) {
            }
            return good;
        }
    }


