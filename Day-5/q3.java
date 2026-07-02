import java.util.Scanner;

public class q3 {
    public static int FACTORS(int x){
      for(int i =1;i<=x/2;i++){
        if(x%i==0){
          System.out.print(i+" ");
        }
      }
      return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        FACTORS(num);
        sc.close();
    }

}