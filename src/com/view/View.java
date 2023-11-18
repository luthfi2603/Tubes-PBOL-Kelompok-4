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
        System.out.println("\nC-102\n" + "=====");
        System.out.println("\nC-103\n" + "=====");
        System.out.println("\nC-104\n" + "=====");
        System.out.println("\nC-105\n" + "=====");
        System.out.println("\nC-106\n" + "=====");
        System.out.println();
    }

    /* public static void index2(){
        System.out.println("\nTubes PBOL Kelompok 4");
        System.out.println("\nC-101\n" + "=====\n");
        System.out.println("Senin" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Senin", "C-101"));
        System.out.println("\nSelasa" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Selasa", "C-101"));
        System.out.println("\nRabu" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Rabu", "C-101"));
        System.out.println("\nKamis" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Kamis", "C-101"));
        System.out.println("\nJumat" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Jumat", "C-101"));
        System.out.println("\nC-102\n" + "=====\n");
        System.out.println("Senin" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Senin", "C-102"));
        System.out.println("\nSelasa" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Selasa", "C-102"));
        System.out.println("\nRabu" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Rabu", "C-102"));
        System.out.println("\nKamis" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Kamis", "C-102"));
        System.out.println("\nJumat" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Jumat", "C-102"));
        System.out.println("\nC-103\n" + "=====\n");
        System.out.println("Senin" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Senin", "C-103"));
        System.out.println("\nSelasa" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Selasa", "C-103"));
        System.out.println("\nRabu" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Rabu", "C-103"));
        System.out.println("\nKamis" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Kamis", "C-103"));
        System.out.println("\nJumat" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Jumat", "C-103"));
        System.out.println("\nC-104\n" + "=====\n");
        System.out.println("Senin" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Senin", "C-104"));
        System.out.println("\nSelasa" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Selasa", "C-104"));
        System.out.println("\nRabu" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Rabu", "C-104"));
        System.out.println("\nKamis" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Kamis", "C-104"));
        System.out.println("\nJumat" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Jumat", "C-104"));
        System.out.println("\nC-105\n" + "=====\n");
        System.out.println("Senin" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Senin", "C-105"));
        System.out.println("\nSelasa" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Selasa", "C-105"));
        System.out.println("\nRabu" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Rabu", "C-105"));
        System.out.println("\nKamis" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Kamis", "C-105"));
        System.out.println("\nJumat" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Jumat", "C-105"));
        System.out.println("\nC-106\n" + "=====\n");
        System.out.println("Senin" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Senin", "C-106"));
        System.out.println("\nSelasa" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Selasa", "C-106"));
        System.out.println("\nRabu" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Rabu", "C-106"));
        System.out.println("\nKamis" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Kamis", "C-106"));
        System.out.println("\nJumat" + "\n------");
        System.out.println(Config.getJadwalPerHariDanRuangan("Jumat", "C-106"));
    } */
}