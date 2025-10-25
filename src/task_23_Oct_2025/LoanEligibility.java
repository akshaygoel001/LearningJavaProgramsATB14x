package task_23_Oct_2025;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age, Salary and credit score: ");
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();
        int credit_score = scanner.nextInt();

        if (age >= 18 && age <= 80 ){
            if (salary >= 30000){
                if (credit_score >= 650 && credit_score <= 850){
                    System.out.println("You are eligible for a loan");
                }
                else {
                    System.out.println("Not Eligible for Loan! Minimum Credit score must be greater than 650 and maximum 850");
                }
            }
            else {
                System.out.println("Not Eligible for Loan! Minimum Salary must be greater than 30,000");
            }
        }
        else {
            System.out.println("Not Eligible for Loan! Minimum Age must be greater than 18 and maximum 80");
        }
    }
}
