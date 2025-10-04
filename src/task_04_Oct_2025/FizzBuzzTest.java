package task_04_Oct_2025;

import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args) {
        fizzBuzzTest();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Grade :");
        gradeCalculator(scanner.nextInt());
    }

    static void fizzBuzzTest(){
        for (int num = 1; num <= 100 ; num ++){
            if (num % 3 == 0){
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0 && num % 5 == 0 ) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(num);
            }
        }
    }

    static void gradeCalculator(int grade){
        if(grade >= 90 && grade <=100){
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        }
        else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        }
        else if (grade >= 0 && grade <= 59) {
            System.out.println("E");
        }
    }
}
