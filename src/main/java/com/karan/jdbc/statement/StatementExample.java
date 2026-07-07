package com.karan.jdbc.statement;

import java.sql.*;

public class StatementExample {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "123321";
        String sql = "select sname from student where sid=1";
        try {

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String name = rs.getString("sname");
            System.out.println(name);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
