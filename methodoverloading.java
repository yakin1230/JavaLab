public class methodoverloading {
    public int add(int a , int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String a, String b){
        return a.concat(b);
    }
    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        int sum1 = obj.add(5,10);
        System.out.println("Sum1: " + sum1);
        double sum2 = obj.add(2.5,3.7);
        System.out.println("Sum2: " + sum2);
        String result = obj.add("hello" , "world");
        System.out.println("result: " + result);    

    }





    
}
