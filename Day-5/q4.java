import java.util.Scanner;

public class q4 {
    public static int Primefactor(int x){
        // Implementation for finding prime factors
        for(int i=2;i<=x/2;i++){
            if(x%i==0){
                boolean isPrime=true;
                for(int j=2;j<=i/2;j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println("PRIME FACTORS ARE"+i+" ");
                }
            }
        }
        return 0;  
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
Primefactor(num);



sc.close();
    }
}
