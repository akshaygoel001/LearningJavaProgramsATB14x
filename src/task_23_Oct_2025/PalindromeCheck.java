package task_23_Oct_2025;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string :");
        String input = scanner.next();

        StringBuilder sb = new StringBuilder();
        String revstring = sb.append(input).reverse().toString();

        if (input.equalsIgnoreCase(revstring)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
