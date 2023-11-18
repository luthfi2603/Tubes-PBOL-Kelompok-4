package com.view;
import java.util.Scanner;
import com.config.Config;

public class View {
    private static Scanner input = new Scanner(System.in);
    private static String pilihan, ruangan, hari;

    public static void index(){
        while(true){
            System.out.print("\n========== MENU ==========\n"
            + "1. Lihat Status Kelas Saat Ini\n"
            + "2. Detail Kelas Perhari\n"
            + "0. Exit\n"
            + "Pilih [1/2/3/4/5/0] : ");
            pilihan = input.nextLine();

            switch(pilihan){
                case "1":
                    getJadwalSaatIni();
                    break;
                case "2":
                    getJadwalPerHariDanRuangan();
                    break;
                case "0":
                    System.out.println("\nExit");
                    break;
                default:
                    System.out.println("Pilihan anda invalid!");
                    break;
            }

            if(pilihan.equalsIgnoreCase("0")){
                break;
            }
        }
    }

    public static void getJadwalPerHariDanRuangan(){
        System.out.println("\n::: Detail Kelas Perhari :::");
        System.out.print("Ruangan : ");
        ruangan = input.nextLine();
        System.out.print("Hari : ");
        hari = input.nextLine();

        System.out.println("\nRuangan : " + ruangan + ", Hari : " + hari);
        System.out.print(Config.getJadwalPerHariDanRuangan(hari, ruangan));
    }

    public static void getJadwalSaatIni(){
        System.out.println("\n::: Halaman Utama :::");
        System.out.println("\nC-101\n" + "=====");
        System.out.print(Config.getJadwalSaatIni("14:00", Config.ubahHari("Wednesday"), "C-101"));
        System.out.println("\nC-102\n" + "=====");
        System.out.print(Config.getJadwalSaatIni("14:00", Config.ubahHari("Wednesday"), "C-102"));
        System.out.println("\nC-103\n" + "=====");
        System.out.print(Config.getJadwalSaatIni("14:00", Config.ubahHari("Wednesday"), "C-103"));
        System.out.println("\nC-104\n" + "=====");
        System.out.print(Config.getJadwalSaatIni("14:00", Config.ubahHari("Wednesday"), "C-104"));
        System.out.println("\nC-105\n" + "=====");
        System.out.print(Config.getJadwalSaatIni("14:00", Config.ubahHari("Wednesday"), "C-105"));
        System.out.println("\nC-106\n" + "=====");
        System.out.print(Config.getJadwalSaatIni("14:00", Config.ubahHari("Wednesday"), "C-106"));
        System.out.println();
    }
}