package com.example.ppbo;
import java.util.Scanner;

public class Main {
    public final static double PHI = 3.14;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============Kalkulator Bola============");
        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();
        System.out.println("===========Hasil Perhitungan===========");

        // Perhitungan volume dan luas permukaan bola
        double volume = (4.0/3.0) * PHI * radius * radius * radius;
        double luasPermukaan = 4 * PHI * radius * radius;

        // Menampilkan hasil
        System.out.println("Volume bola: " + volume);
        System.out.println("Luas permukaan bola: " + luasPermukaan);
        scanner.close();
    }
}