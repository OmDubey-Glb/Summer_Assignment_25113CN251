import  java.util.Scanner;
public class q1 {


     public static void main(String[]args){
   Scanner sc = new Scanner(System.in);

   System.out.print("enter the number  ");
   int num = sc.nextInt();
       
   int sum = 0;
   int  b =0;
    while ( num!=0)
 {
    b=  num%10;
   sum =sum+b;
   num/=10;

   }
    System.out.println("sum of digit are   "+sum);

   sc.close();
    }
}
