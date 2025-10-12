package coding_challenge_12102025;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Challenge10 {
    /*Write a program to create a simple calculator using switch statement.

**Requirements:**
- Read two numbers and an operator (+, -, *, /)
- Use switch statement to perform the operation
- Handle division by zero
- Display the result
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /) :");
        String operator = scanner.next();
        switch (operator){
            case "+":
                System.out.println("Result: "+(num1 + num2));
                break;
            case "-":
                System.out.println("Result: "+(num1 - num2));
                break;
            case "*":
                System.out.println("Result: "+(num1 * num2));
                break;
            case "/":
                try{
                    int result = (int)(num1 / num2);
                    System.out.println("Result: "+result);
                } catch (Exception e) {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println(" Invalid operator");
                break;
        }



    }
}
