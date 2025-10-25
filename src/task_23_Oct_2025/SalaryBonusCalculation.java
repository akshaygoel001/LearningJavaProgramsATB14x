package task_23_Oct_2025;

import java.util.Scanner;

public class SalaryBonusCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter years of experience(in years): ");
        double year_exp = scanner.nextDouble();
        if (year_exp <= 1){
            System.out.println("No Bonus");
        } else if (year_exp > 1 && year_exp < 4) {
            System.out.println("You got a bonus of 5% of the salary: "+(0.05 * salary));
        } else if (year_exp > 4 && year_exp <= 6) {
            System.out.println("You got a bonus of 10% of the salary: "+(0.10 * salary));
        }
        else {
            System.out.println("You got a bonus of 15% of the salary: "+(0.15 * salary));
        }
    }
}
