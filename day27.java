package idamusdalifah;

import java.util.Scanner;

public class day27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan tinggi (m): ");
        double tinggi = scanner.nextDouble();

        double bmi = berat / (tinggi * tinggi);

        System.out.println(" jadi tinggi dan berat badan saya adalah: " + bmi);
    }
}


