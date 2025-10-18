package task_17_Oct_2025;

import java.util.Scanner;

public class ATMWithdrawalSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any amount you want to withdraw: ");
        long withdrawal_amount = scanner.nextLong();
        long acc_balance = 10000;
        long updated_balance;
        if (withdrawal_amount > 0){
            if (withdrawal_amount % 100 == 0){
                if (withdrawal_amount < acc_balance){
                    updated_balance = acc_balance - withdrawal_amount;
                    System.out.println("Updated account balance is :"+updated_balance);
                }
                else {
                    System.out.println("Error!\nWithdrawal amount must less than current account balance :"+ acc_balance);
                }
            }
            else {
                System.out.println("Error!\nWithdrawal amount must be a multiple of 100");
                System.out.println("Current Balance is : "+acc_balance);
            }
        }
        else {
            System.out.println("Invalid withdrawal amount");
            System.out.println("Current Balance is : "+acc_balance);
        }
    }
}
