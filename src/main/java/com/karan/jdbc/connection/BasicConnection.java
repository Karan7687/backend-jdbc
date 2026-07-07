package com.karan.jdbc.connection;
import java.sql.*;
public class BasicConnection {
    public static void main(String[] args) {

        String url="jdbc:postgresql://localhost:5432/demo";
        String username ="postgres";
        String password="123321";

        try{
            Connection con=DriverManager.getConnection(url, username,password);
            System.out.println("Connected to the database");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }

    }
}
