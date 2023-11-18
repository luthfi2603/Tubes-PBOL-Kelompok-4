package com.config;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Config {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tubes_pbol";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection connect;
    private static Statement statement;
    private static ResultSet result;

    public static LocalDate currentDate = LocalDate.now();
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
    public static String formattedDate = currentDate.format(formatter);
    
    public static LocalTime currentTime = LocalTime.now();
    public static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
    public static String formattedTime = currentTime.format(formatter2);

    private static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
    }

    public static String ubahHari(String day){
        String hari = "";

        switch(day){
            case "Sunday":
                hari = "Minggu";
                break;
            case "Monday":
                hari = "Senin";
                break;
            case "Tuesday":
                hari = "Selasa";
                break;
            case "Wednesday":
                hari = "Rabu";
                break;
            case "Thursday":
                hari = "Kamis";
                break;
            case "Friday":
                hari = "Jumat";
                break;
            case "Saturday":
                hari = "Sabtu";
                break;
        }

        return hari;
    }

    public static String getJadwalPerHariDanRuangan(String hari, String ruangan){
        connection();

        String data = "";

        try {
            statement = connect.createStatement();
            String query = "SELECT * FROM gabungan WHERE hari = '" + hari + "' AND kode_ruangan = '" + ruangan + "' ORDER BY hari, jam";

            result = statement.executeQuery(query);

            while(result.next()){
                data += result.getString(1) + " | "
                + result.getString(2) + " | "
                + result.getString(3) + " | "
                + result.getString(4) + " | "
                + result.getString(5) + " | "
                + result.getString(6) + " | "
                + result.getString(7) + " | "
                + result.getString(8) + " | "
                + result.getString(9) + " | "
                + result.getString(10) + " | "
                + result.getString(11) + "\n";
            }

            if(data == ""){
                data = "Kosong\n";
            }

            statement.close();
            connect.close();
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }

        return data;
    }

    public static String getJadwalSaatIni(String jam, String hari, String ruangan){
        connection();

        String data = "";

        try {
            statement = connect.createStatement();
            String query = "SELECT semester, kom, kode_matkul, kode_dosen FROM gabungan WHERE hari = '" + hari + "' AND kode_ruangan = '" + ruangan + "' AND '" + jam + "' BETWEEN STR_TO_DATE(SUBSTRING_INDEX(jam, '-', 1), '%H:%i') AND STR_TO_DATE(SUBSTRING_INDEX(jam, '-', -1), '%H:%i')";

            result = statement.executeQuery(query);

            while(result.next()){
                data += result.getString(1) + " | "
                + result.getString(2) + " | "
                + result.getString(3) + " | "
                + result.getString(4) + "\n";
            }

            if(data == ""){
                data = "Kosong\n";
            }

            statement.close();
            connect.close();
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }

        return data;
    }
}