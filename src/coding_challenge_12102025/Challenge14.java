package coding_challenge_12102025;

import java.util.Scanner;

public class Challenge14 {
    //right angle triangle
    // pyramid patter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows for star pattern: ");
        int row = scanner.nextInt();
        System.out.println("Right triangle pattern:");
        for (int i = 0 ; i < row ; i++){
            for(int j = 0; j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pyramid:");
        for (int i = 0; i < row ; i++){
            for (int j = 0; j < row - i - 1;j++){
                System.out.print(" ");
            }
            for (int j = 0;j <= (2 * i); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
