package com.example.ppbo;

public class OperatorAssignment {
    public static void main(String[] args) {
        int num = 10;

        num += 5; // num = num + 5; // 15
        num -= 5; // num = num - 5; // 12
        num *= 5; // num = num * 5; // 24
        num /= 5; // num = num / 5; // 6
        num %= 5; // num = num % 5; // 2

        System.out.println("Hasil akhir: " + num);
    }
}