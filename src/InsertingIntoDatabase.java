/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author mabdullahi
 */
public class InsertingIntoDatabase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter First Name: ");
        String first_name = sc.next();

        System.out.println("Enter Second Name: ");
        String last_name = sc.next();

        System.out.println("Enter PhoneNumber: ");
        String phone = sc.next();

        System.out.println("Enter Amount: ");
        String amount = sc.next();

        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl = "jdbc:mysql://localhost:3306/";
        String mydatabase = "mydatabse2";
        String username = "root";
        String password = "";

        Connection conn = DriverManager.getConnection(connectionUrl + mydatabase, username, password);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("INSERT INTO`payment`( `first_name`, `last_name`, `phone`, `amount`) VALUES ('"+first_name+"', '"+last_name+"', '"+phone+"','"+amount+"')");
        System.out.println("All values were successfully added to the database !");

        conn.close();
        stmt.close();

    }

}
