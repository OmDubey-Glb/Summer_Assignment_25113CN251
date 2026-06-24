import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = sc.nextInt();

        int fact = 1;  // accumulator variable

        for(int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + a + " is: " + fact);

        sc.close();
    }
}
