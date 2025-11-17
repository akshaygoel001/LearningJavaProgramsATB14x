package coding_challenge_16112025;

public class Challenge11 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Integer addition: "+calculator.add(5,3)+" Double addition: "+calculator.add(2.5,3.7)+" Three integers addition: "+calculator.add(1,2,3));
    }
}
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
}
