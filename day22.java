package idamusdalifah;

import java.util.Scanner;

public class day22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        int hasil = angkaPertama + angkaKedua;

        System.out.println("Hasil dari " + angkaPertama + " + " + angkaKedua + " = " + hasil);
    }
}
