package coding_challenge_16112025;

public class Challenge12 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(parent.display()+" "+child.display());
    }
}
class Parent{
    public String display(){
        return "Parent class display method";
    }
}
class Child extends Parent{
    public String display(){
        return "Child class display method";
    }
}
