package coding_challenge_16112025;

import javax.crypto.spec.PSource;

public class Challenge1 {
    public static void main(String[] args) {
        Person p1 = new Person("John",25);
        Person p2 = new Person("Alice",30);
        System.out.println(p1.display());
        System.out.println(p2.display());
    }
}
class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String display(){
        return "Name: "+this.name+", Age: "+this.age;
    }
}
