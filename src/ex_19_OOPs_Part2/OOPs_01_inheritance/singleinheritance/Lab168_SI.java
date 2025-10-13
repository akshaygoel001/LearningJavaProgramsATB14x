package ex_19_OOPs_Part2.OOPs_01_inheritance.singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        Son akshay = new Son();
        System.out.println(akshay.gold_f);
        akshay.bhk2();
        akshay.bhk3();

        Father f1  = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
        // f1.bhk3();?
    }
}
