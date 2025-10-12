package coding_challenge_12102025;

import java.util.Scanner;

public class Challenge6 {
//    Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//            - Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
//    Input:10 3.5
//    Expression result: 23 Implicit casting: 13.5 Explicit casting: 13
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        }
        else {
            System.out.println(num + " is zero");
        }

    }
}
