package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);//false

        boolean b = true;
        System.out.println(!!b);//true

        boolean c= true || false;

        System.out.println(c);//true

        boolean c1= false && true;
        System.out.println(c1);//false
    }
}
