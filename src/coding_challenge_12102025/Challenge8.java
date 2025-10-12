package coding_challenge_12102025;

import java.util.Scanner;

public class Challenge8 {
//    Write a program to check if a given year is a leap year.
//
//**Requirements:**
//            - A year is leap if it's divisible by 4
//            - Exception: if divisible by 100, it's not leap unless also divisible by 400
//            - Use logical operators in conditions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year :");
        int year = scanner.nextInt();
        if (year % 100 == 0 && year % 400 == 0 && year % 4 == 0
            || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println(year +" is a leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }

    }
}
