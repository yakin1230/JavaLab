//package labrecord;
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int sum =0;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            sum =a+b;
            a =b;
            b =sum;
        }
        sc.close();
    }
}