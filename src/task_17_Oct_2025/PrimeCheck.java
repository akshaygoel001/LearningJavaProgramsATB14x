package task_17_Oct_2025;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= 10;i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }

    }
}
