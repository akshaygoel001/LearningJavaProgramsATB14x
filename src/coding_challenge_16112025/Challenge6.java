package coding_challenge_16112025;

public class Challenge6 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        bike.start();
    }
}
class Vehicle{
    public void start(){
    }

}
class Car extends Vehicle{
    public void start(){
        System.out.println("Car engine starts with a roar!");
    }

}
class Bike extends Vehicle{
    public void start(){
        System.out.println("Bike engine starts with a purr!");
    }
}
