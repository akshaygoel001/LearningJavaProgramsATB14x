package task_17_Oct_2025;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 <= num2 && num1 <= num3){
            System.out.println("Smallest of three numbers is :"+ num1);
        } else if (num2 < num1 && num2 <= num3) {
            System.out.println("Smallest of three numbers is :"+ num2);
        }
        else {
            System.out.println("Smallest of three numbers is :"+ num3);
        }
    }
}
