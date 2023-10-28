package idamusdalifah;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class day20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan penghasilan per bulan (dalam rupiah): ");
            double penghasilan = scanner.nextDouble();

            double pajak;
            if (penghasilan >= 5_000_000) {
                pajak = 0.10 * penghasilan;
            } else if (penghasilan >= 3_000_000) {
                pajak = 0.05 * penghasilan;
            } else {
                pajak = 0;
            }

            double penghasilanBersih = penghasilan - pajak;

            // Untuk format mata uang dalam Rupiah
            NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

            System.out.println("Pajak yang harus dibayarkan: " + rupiah.format(pajak));
            System.out.println("Penghasilan bersih: " + rupiah.format(penghasilanBersih));

        } catch (Exception e) {
            System.out.println("Harap masukkan angka yang valid.");
        }
    }
}


