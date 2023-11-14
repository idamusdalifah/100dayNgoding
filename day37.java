package idamusdalifah;

import java.util.Scanner;

public class day37 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Menampilkan pesan selamat datang berdasarkan input pengguna
        System.out.println("Selamat datang, " + nama + "!");

        // Menutup objek Scanner
        scanner.close();
    }
}

