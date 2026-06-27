import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter smaller number"  );
        int num1 = sc.nextInt();
            System.out.println("enter greater number"  );
        int num2 = sc.nextInt();

        for (int n = num1; n <= num2; n++) {
            if (n <= 1) {
                continue; // skip 0 and 1
            }

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime number: " + n);
            }
        }

        sc.close();
    }
}

