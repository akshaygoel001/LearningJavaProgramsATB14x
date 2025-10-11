package task_10_Oct_2025;

import java.util.Scanner;

public class Maximum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int max = num1 > num2 ? num1 : num2;
        System.out.println("Maximum is :"+ max);

    }
}
