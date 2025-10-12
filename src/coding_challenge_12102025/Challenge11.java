package coding_challenge_12102025;

import java.util.Scanner;

public class Challenge11 {
//    Write a program to print numbers from 1 to N using a for loop.
//
//**Requirements:**
//            - Read the value of N from user input
//- Use for loop to print numbers from 1 to N
//- Print numbers in a single line separated by spaces
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = scanner.nextInt();
        for (int i = 1 ; i <= num ; i++){
            System.out.print(i +" ");
        }

    }
}
