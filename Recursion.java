import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {
        if(n==0 || n==1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static int lcm(int a, int b, int c){
        return lcm(lcm( a, b), c);
    }
    public static int lcm(int a, int b){
        return (a * b) / gcd(a , b);
    }
    public static int gcd(int a , int b){
        if(b==0)
            return a;
        else   
            return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to calculate factorial: ");
        int num =  scanner.nextInt();
        System.out.println("factorial of " + num + " is: " + factorial(num));
        System.out.println("enter three numbers to calculate LCM: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("LCM is" + num1 +", " + num2 + ", " + num3 +", is:" + lcm(num1,num2,num3));
        scanner.close();


    }
}
