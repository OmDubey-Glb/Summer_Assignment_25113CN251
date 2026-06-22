import java.util.Scanner;

public class q4 {
    public static  void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int count  = 0;
      System.out.println("enter num.");
      int num = sc.nextInt();

       while (num!=0) {
        
        count++;
       num/=10;


       }
System.out.println("number of digits are   " + count);




sc.close();
      }








    
}
