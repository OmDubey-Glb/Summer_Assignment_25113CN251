import java.util.Scanner;


public class q1{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
 System.out.println(" ");


 System.out.println("my 1st question ");


 System.out.println(" ");

 System.out.println("enter number: ");
int a = sc.nextInt();
int sum = 0;

 
   if(a>0){
     
       for(int i=1; i<=a; i++){

              sum = sum +i;




           
        }
  
System.out.println(sum+" ");

  }
else{
     System.err.println("invalid num");


}



        sc.close();
    }

    
}