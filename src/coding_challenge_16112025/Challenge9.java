package coding_challenge_16112025;

public class Challenge9 {
    public static void main(String[] args) {
        Rectangles rectangle = new Rectangles();
        Circles circle = new Circles();
        System.out.println(rectangle.draw()+" "+circle.draw());
    }
}
interface Drawable{
    public void draw();
}

class Rectangles{
    public String draw() {
        return "Drawing a Circle";
    }
}
class Circles{
    public String draw() {
        return "Drawing a Rectangle";
    }
}

