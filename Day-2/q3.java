import  java.util.Scanner;
public class q3 {


     public static void main(String[]args){
   Scanner sc = new Scanner(System.in);

   System.out.print("enter the number  ");
   int num = sc.nextInt();
       
   int mul = 1;
   int  b =0;
    while ( num!=0)
 {
    b=  num%10;
   mul =mul*b;
   num/=10;

   }
    System.out.println( "pdt of digit are   "+ mul);

   sc.close();
    }
}
