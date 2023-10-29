package idamusdalifah;

import java.util.Scanner;

public class day21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        if (sisi <= 0) {
            System.out.println("Input tidak valid!");
            return;
        }

        double volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus: " + volume);

        double luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}
