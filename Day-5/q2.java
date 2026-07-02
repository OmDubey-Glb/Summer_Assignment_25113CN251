import java.util.Scanner;

public class q2 {
    public static int Factorial(int x) {
      
        
        int sum =0;
        while (x > 0) {
            int digit = 0;
             digit = x % 10 ;
              int fact = 1;
           

            for (int i = 1; i <= digit; i++) {
                fact *= i;
            
            }
             sum = fact + sum;
            x /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number:");
        int num = sc.nextInt();
       

        int result = Factorial(num);

        if (result == num) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
        sc.close();
    }

}
