import java.util.Scanner;
public class scanner_static {
    static class mathutils {
        public static int factorial(int n){
            if(n==0 || n==1)
                return 1;
            else
                return n * factorial(n - 1);
        }
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a number to calaculate its factorial: ");
        int num = scanner.nextInt();
        int fact = mathutils.factorial(num);
        System.out.println("factorial of" + num + " is: " + fact);
        scanner.close();
    }
    
}
