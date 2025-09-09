package com.example.ppbo;
import java.util.Scanner;
public class Main 
{
    public static final double PI = 3.14;
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("================Kalkulator Bola=================");
        System.out.print("Masukkan jari-jari (cm): ");
        double radius = scanner.nextDouble();
        System.out.println("=================Hasil Perhitungan==============");

        // Perhitungan volume dan luas permukaan bola
        double volume = (4.0/3.0) * PI * radius * radius * radius;
        double luasPermukaan = 4 * PI * radius * radius;

        // Menampilkan hasil
        System.out.println("Volume bola: " + volume + " cm³");
        System.out.println("Luas permukaan bola: " + luasPermukaan + " cm²");
        
        scanner.close();
    }
}