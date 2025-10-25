package task_23_Oct_2025;

import java.util.Scanner;

public class PersonTravelEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of person: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Enter Visa status(valid/invalid): ");
            String visa_status = scanner.next();
            if (visa_status.equalsIgnoreCase("valid")){
                System.out.println("Person can travel");
            } else if (visa_status.equalsIgnoreCase("invalid")) {
                System.out.println("Person can't travel because of invalid visa");
            }
            else {
                System.out.println("Visa status must be either valid or invalid!!!");
            }
        }
        else if(age < 0){
            System.out.println("Age must be a positive value!!!");
        }
        else {
            System.out.println("Person can't travel as age is less than 18");
        }
    }
}
