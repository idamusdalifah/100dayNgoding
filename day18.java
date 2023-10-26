package idamusdalifah;

import java.util.Scanner;

public class day18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nama = {"Atul", "Biang", "Wiwi", "Lica"};

        System.out.println("Masukkan hari (1-7):");
        int hari = scanner.nextInt();

        if (hari >= 1 && hari <= 7) {
            System.out.println("Pada hari ke-" + hari + ", " + nama[(hari - 1) % 4] + " akan mencuci piring.");
        } else {
            System.out.println("Masukkan angka valid antara 1-7 untuk hari.");
        }

    }
}
