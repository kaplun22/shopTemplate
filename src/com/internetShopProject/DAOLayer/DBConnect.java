package com.internetShopProject.DAOLayer;

import sun.util.logging.resources.logging;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by Андрій on 02.03.2017.
 */


public class DBConnect {



    private static Logger log = Logger.getLogger(DBConnect.class.getName());

    private static final String URL="jdbc:postgresql://localhost:5432/postgres";
    private static final String login="postgres";
    private static final String password="1723";



    public static Connection getConnectionToDB() throws Exception{
        Connection connection = null;

        try{
            Class.forName("postgresql-42.0.0.jar");
            connection = DriverManager.getConnection(URL, login, password);
            if(connection!=null){
                System.out.println("Connected");
                return connection;
            }else{
                throw new Exception("Connection is not established!");
            }
        }catch(Exception e){
            log.log(Level.SEVERE, e.getMessage());
            throw new Exception("Connection is not established!");
        }
    }
}
