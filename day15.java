package idamusdalifah;

import java.util.ArrayList;

public class day15 {

    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("wiwi");
        daftarNama.add("bian");
        daftarNama.add("mawa");

        System.out.println("Ukuran ArrayList: " + daftarNama.size());

        for (String nama : daftarNama) {
            System.out.println(nama);
        }

        daftarNama.remove("bian");

        System.out.println("\nDaftar Nama setelah menghapus:");
        for (String nama : daftarNama) {
            System.out.println(nama);
        }
    }
}
