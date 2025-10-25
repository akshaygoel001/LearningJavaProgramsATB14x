package task_24_Oct_2025;

import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of total_days to be converted to years, months and total_days: ");
        int total_days = scanner.nextInt();
        System.out.print("Given "+total_days+" days are equivalent to ");

        int years = total_days / 365;
        int months = (total_days % 365) / 30;
        int days = (total_days % 365) % 30;
        System.out.printf("%d years %d months and %d days", years,months, days);

    }
}
