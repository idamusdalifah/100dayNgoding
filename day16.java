package idamusdalifah;

public class day16 {

    public static void main(String[] args) {

        int[] angka = {1, 2, 3, 4, 5};

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen di indeks " + i + ": " + angka[i]);
        }

        int total = 0;
        for (int num : angka) {
            total += num;
        }
        double rataRata = (double) total / angka.length;
        System.out.println("Rata-rata dari elemen array: " + rataRata);
    }
}
