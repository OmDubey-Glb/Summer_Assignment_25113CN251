import java.util.Scanner;

public class FibonacciSeries {

    // Method to print Fibonacci series up to n terms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms:");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number of terms must be positive.");
            
        }

        long first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first );
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        sc.close();
    }}

