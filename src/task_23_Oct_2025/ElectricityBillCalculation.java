package task_23_Oct_2025;

import java.util.Scanner;

public class ElectricityBillCalculation {
    //Define the rate structure for calculating the bill based on the number of units consumed.
    //
    //            :-  First 100 units: 0.50Rs per unit
    //
    //            :-  Next 100 units (101-200): 0.75Rs per unit
    //
    //            :- Next 100 units (201-300): 1.20Rs per unit
    //
    //            :- Above 300 units: 1.50Rs per unit
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter units consumed :");
        double units = scanner.nextDouble();
        double bill = 0;
        if (units <= 100){
            bill = 0.5 * units;
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        } else if (units > 100 && units <= 200) {//150
            bill = (0.5 * 100) + (0.75 * (units - 100));
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        } else if(units > 200 && units <= 300 ){// 250 = 100 + 100 + 50
            bill = (0.5 * 100) + (0.75 * 100) + (1.2 * (units - 200));
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        }
        else { // 350
            bill = (0.5 * 100) + (0.75 * 100) + (1.2 * 100) + (1.5 * (units - 300));
            System.out.printf("Total bill is %.2f Rs. for %d units consumed",bill, (int)units);
        }
    }
}
