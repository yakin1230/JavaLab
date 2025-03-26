class vehicle {
    void move(){
        System.out.println("vehicle is moving");
    }
}
class car extends vehicle {
    void drive(){
        System.out.println("car is being driven");
    }
}
class sportscar extends car{
    void speedup(){
        System.out.println("sportscar is speeding up");
    }
}
class truck extends vehicle{
    void carryload(){
        System.out.println("truck is caryying a loading");
    }
}
public class allinheritance{
    public static void main(String[] args) {
        //single inheritance
        car car = new car();
        car.move();
        car.drive();
        //multiple ineritance
        sportscar sportscar = new sportscar();
        sportscar.move();
        sportscar.drive();
        sportscar.speedup();
        //hierarchial inheritance
        truck truck = new truck();
        truck.move();
        truck.carryload();


    }
}