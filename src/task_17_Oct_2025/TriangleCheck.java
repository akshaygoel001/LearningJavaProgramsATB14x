package task_17_Oct_2025;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle :");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
