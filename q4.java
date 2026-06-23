import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
System.out.print("enter the number  ");
   int num = sc.nextInt();
   int orignalnum=num;
int rev=0;
int b =0;
while (num!=0) {
     b=num%10;
     rev = (rev*10)+b;
     num/=10;
}
int rev2 =rev;
if(orignalnum==rev2){
System.out.println("it is  palindrome");


  }
   else{
    System.out.println("not palindrome");
}


     sc.close();
    }
}

