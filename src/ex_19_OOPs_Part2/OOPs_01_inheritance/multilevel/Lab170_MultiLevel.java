package ex_19_OOPs_Part2.OOPs_01_inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son akshay = new Son();
        akshay.home();
        akshay.bhk3();
        akshay.gf();
        akshay.extra();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        GrandFather gf =  new GrandFather();
        gf.gf();
        gf.home();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1  = new Son();
        //Son s1 = new GrandFather();
        //Son s2 = new Father();


    }
}
