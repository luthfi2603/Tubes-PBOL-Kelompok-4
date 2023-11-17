package com.config;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Config {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbol";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection connect;
    private static Statement statement;
    private static ResultSet result;

    public static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            System.out.println("Koneksi Berhasil");
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}