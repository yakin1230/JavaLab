import java.util.Scanner;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int n= sc.nextInt();
        int Count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                Count++;
            }
        }
        if(Count==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }

    }
    
    
}
 