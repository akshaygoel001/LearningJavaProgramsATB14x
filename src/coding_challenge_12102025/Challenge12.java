package coding_challenge_12102025;

import java.util.Scanner;

public class Challenge12 {
//    Create a program to calculate factorial of a number using while loop.
//
//**Requirements:**
//            - Read a positive integer from user input
//- Use while loop to calculate factorial
//- Handle edge case for 0! = 1
//            - Use appropriate data type to handle large results

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int input = scanner.nextInt();
        int num = input;
        int fact = 1;
        if (num == 0){
            System.out.println("Factorial of "+input+" is: "+fact);
        }
        else {
            while (num > 0){
                fact = fact * num;
                num = num - 1;
            }
            System.out.println("Factorial of "+input+" is: "+fact);
        }
    }
}
