import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
System.out.print("enter the number  ");
   int num = sc.nextInt();
int rev=0;
int b =0;
while (num!=0) {
     b=num%10;
     rev = (rev*10)+b;
     num/=10;
}
System.out.println(rev);


     sc.close();
    }
}
