package coding_challenge_12102025;

public class Challenge3 {
//    Write a program that demonstrates comparison and logical operators.
//
//    **Requirements:**
//    - Use comparison operators (==, !=, <, >, <=, >=)
//    - Use logical operators (&&, ||, !)
//    - Print boolean results with explanatory messages
//    Input: 10 5
//    Output:
//    a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
    public static void main(String[] args) {
       int a = 10;
       int b = 5;

       System.out.println("a == b: "+ (a==b) + " a > b: "+ (a>b) + " a < b: "+ (a<b)+ " (a > b) && (a > 0): "+ ((a > b) && (a > 0))+" (a < b) || (a > 0): "+ ((a < b) || (a > 0))+" !(a > b): "+ !(a > b));


    }
}
