package coding_challenge_16112025;

public class Challenge13 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println("Outer class variable x: "+o.x+" Inner class accessing outer variable: "+i.show());
    }
}
class Outer {
    int x = 10;

    class Inner {
        int show() {
            return x;
        }

    }
}
