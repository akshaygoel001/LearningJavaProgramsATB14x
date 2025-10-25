package task_23_Oct_2025;

import java.util.Scanner;

public class ArmstrongNumber {
    //An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the total number of digits.
    // For example, \(153\) is an Armstrong number because it has three digits, and
    // 1^{3}+5^{3}+3^{3}=1+125+27=153
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number :");
        String input = scanner.next();
        int len = input.length();
        int num = Integer.parseInt(input);
        int sum = 0 ;
        while(num != 0){
            int rem = num % 10 ;
            sum = sum + (int)Math.pow(rem,len);
            num = num /10;
        }
        System.out.println(sum);
        if (input.equalsIgnoreCase(String.valueOf(sum))){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
