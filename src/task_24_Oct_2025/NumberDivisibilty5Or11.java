package task_24_Oct_2025;

import java.util.Scanner;

public class NumberDivisibilty5Or11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        String result = (num % 5 == 0 && num % 11 == 0) ? "Number is divisible by 5 and 11" : "Number is not divisible by 5 and 11";
        System.out.println(result);

    }
}
