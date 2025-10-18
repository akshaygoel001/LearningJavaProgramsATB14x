package task_17_Oct_2025;

import java.util.Scanner;

public class SmallestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 < num2){
            System.out.println("Smallest number is : "+num1);
        }
        else {
            System.out.println("Smallest number is : "+num2);
        }
    }
}
