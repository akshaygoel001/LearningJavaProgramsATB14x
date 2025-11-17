package coding_challenge_16112025;

public class Challenge10 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println(duck.fly()+" "+duck.swim());
    }
}
interface Flyable{
    public String fly();

}
interface Swimmable{
    public String swim();
}
class Duck{
    public String fly(){
        return "Duck is flying in the sky!";
    }
    public String swim(){
        return "Duck is swimming in the water!";
    }
}