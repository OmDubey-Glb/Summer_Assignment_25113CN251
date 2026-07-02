import java.util.Scanner;

public class q1 {
    public static int DIVISOR(int n) {
        int count = 0;
        for (int i = 1; i < n/2 ; i++) {
            if (n % i == 0) {
                count += i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum of divisors of " + num + " is: " + DIVISOR(num));
        if (DIVISOR(num) == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        sc.close();
    }
}
