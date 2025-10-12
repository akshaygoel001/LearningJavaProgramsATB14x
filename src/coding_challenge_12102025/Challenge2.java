package coding_challenge_12102025;

public class Challenge2 {
//    Create a Java program that demonstrates various arithmetic and assignment operators.
//
//   **Requirements:**
//    - Use +, -, *, /, % operators
//    - Demonstrate assignment operators (=, +=, -=, *=, /=)
//    - Show the results of each operation
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        System.out.printf("Addition: %d Subtraction: %d Multiplication: %d Division: %d Modulus: %d",sum,subtraction,multiplication,division,modulus);

    }
}
