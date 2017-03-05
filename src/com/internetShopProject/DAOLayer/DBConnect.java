package com.internetShopProject.DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;

/**
 * Created by Андрій on 02.03.2017.
 */
public class DBConnect {

            private static final String URL="jdbc:<yourDB>://localhost:5432/SID";
    private static final String login="bc:<yourDB>://localhost:5432/SID";
    private static final String password="1723";



    public static Connection getConnectionToDB() throws Exception{
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(<URL>, <login>, <password>);
            if(connection!=null){
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
