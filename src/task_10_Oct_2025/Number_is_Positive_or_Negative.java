package task_10_Oct_2025;

import java.util.Scanner;

public class Number_is_Positive_or_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        }
    }
}
