package coding_challenge_16112025;

public class Challenge5 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
class Animal{
    public void makeSound(){
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog says: Woof! Woof!");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat says: Meow! Meow!");
    }
}
