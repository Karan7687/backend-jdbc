package com.karan.jdbc.statement;

import java.sql.*;

public class StatementExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "123321";
        String sql = "delete from student where sid=2";
        try {

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            Statement st = con.createStatement();

            st.execute(sql);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
