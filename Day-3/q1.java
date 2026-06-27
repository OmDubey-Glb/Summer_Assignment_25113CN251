import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        System.out.println("Welcome to day 3 of assignment");
        System.out.println();

        System.out.println("LETS check Prime numbers");

        System.out.println(" ");
        System.out.println("enter any number:");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
       boolean isPrime = true; // Assume it is prime at first

if (num <= 1) {
    System.out.println("its neither prime nor composite");
} else {
    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            isPrime = false; // Found a factor, so it is not prime
            break;           // Exit the loop immediately
        }
    }

    // Move your print statements OUTSIDE the for loop
    if (isPrime) {
        System.out.println("num is prime");
    } else {
        System.out.println("number is not prime");
    }
}

        sc.close();
    }

}