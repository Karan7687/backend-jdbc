package com.karan.jdbc.preparedStatement;
import java.sql.*;

public class PreparedStatementExample {


    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String username = "postgres";
        String password = "123321";

        int sid=55;
        String sname="Prerna";
        int marks=500;
        String sql = "insert into student values(?,?,?)";
        try {

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            PreparedStatement st= con.prepareStatement(sql);
            st.setInt(1,sid);
            st.setInt(2,marks);
            st.setString(3,sname);

            st.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
