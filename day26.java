package idamusdalifah;

public class day26 {

    public static void main(String[] args) {
        int n = 10;
        int first = 0, second = 1;

        System.out.print("Deret Fibonacci hingga " + n + " elemen: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

}
