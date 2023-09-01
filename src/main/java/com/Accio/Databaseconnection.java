package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {
    static Connection connection= null;
    public static Connection getConnection(){
        if(connection!=null){
            return connection;
        }
        String user="root";
        String psw="Gopal@1972";
        String database= "searchengine";
        return getConnection(user,psw,database);
    }
    private static Connection getConnection(String user,String psw,String database){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+database+"?user="+user+"&password="+psw);
        }
        catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return connection;
    }

}

