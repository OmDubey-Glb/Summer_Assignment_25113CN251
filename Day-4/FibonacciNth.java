import java.util.Scanner;

public class FibonacciNth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Nth term is: " + a);
        } else if (n == 1) {
            System.out.println("Nth term is: " + b);
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;   // next term
                a = b;       // shift forward
                b = c;
            }
            System.out.println("Nth term is: " + c);
        }
        sc.close();
    }
}
