package idamusdalifah;

import java.util.ArrayList;

public class day31 {

    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();

        daftarNama.add("immal");
        daftarNama.add("dipa");
        daftarNama.add("dipamal");

        System.out.println("Isi ArrayList: " + daftarNama);

        System.out.println("Elemen kedua: " + daftarNama.get(1));

        daftarNama.set(1, "Barbara");
        System.out.println("Setelah mengubah elemen kedua: " + daftarNama);

        daftarNama.remove(0);
        System.out.println("Setelah menghapus elemen pertama: " + daftarNama);

        System.out.println("Jumlah elemen dalam ArrayList: " + daftarNama.size());

        System.out.println("Apakah ArrayList kosong? " + daftarNama.isEmpty());
    }
}


