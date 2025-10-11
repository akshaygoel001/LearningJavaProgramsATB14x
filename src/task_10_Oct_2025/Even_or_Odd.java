package task_10_Oct_2025;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Odd");
        }
        else {
            System.out.println("Number is Even");
        }
    }
}
