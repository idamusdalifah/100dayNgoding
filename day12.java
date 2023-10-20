package idamusdalifah;

public class day12 {

    public static void main(String[] args) {

        int[] angkaAngka = {1, 2, 3, 4, 5};
        int total = hitungTotal(angkaAngka);

        System.out.print("Angka yang akan dijumlahkan: ");
        for (int i = 0; i < angkaAngka.length; i++) {
            System.out.print(angkaAngka[i] + (i < angkaAngka.length - 1 ? ", " : ""));
        }

        System.out.println("\nHasil penjumlahan: " + total);
    }

    private static int hitungTotal(int[] angkaAngka) {
        int total = 0;
        for (int angka : angkaAngka) {
            total += angka;
        }
        return total;
    }
}
