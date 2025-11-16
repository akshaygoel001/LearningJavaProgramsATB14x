package coding_challenge_16112025;

public class Challenge8 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        System.out.println("Rectangle Area: "+rectangle.getArea()+" Circle Area: "+circle.getArea());

    }
}
abstract class Shape{
    public abstract double getArea();
}
class Rectangle{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return this.length * this.width;
    }
}
class Circle{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;

    }
}
