package task_23_Oct_2025;

import java.util.Scanner;

public class EmployeeNetSalaryCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Basic pay amount: ");
        double basic_pay = scanner.nextDouble();
        double hra = basic_pay * 0.5;
        double da = basic_pay * 0.29;
        System.out.println("Enter Tax Deduction amount: ");
        double tax_deductions = scanner.nextDouble();
        double employee_net_Salary = 0;
        if (basic_pay > tax_deductions){
            employee_net_Salary = (basic_pay + hra +da) - tax_deductions;
            System.out.println("Employee net salary is: "+employee_net_Salary);
        }
        else {
            System.out.println("Basic pay must be greater than tax deductions");
        }
    }
}
