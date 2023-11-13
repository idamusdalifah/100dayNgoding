package idamusdalifah;

import java.util.Scanner;

public class day36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.println("Hasil perkalian: " + (angka1 * angka2));

        scanner.close();
    }
}


