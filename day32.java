package idamusdalifah;

public class day32 {
    public static void main(String[] args) {
        int n = 10;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap.");
            } else {
                System.out.println(i + " adalah bilangan ganjil.");
            }
        }
    }
}
