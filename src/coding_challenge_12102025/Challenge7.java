package coding_challenge_12102025;

public class Challenge7 {
//    Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//            - Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 27;
        int num3 = 19;
        if(num1 > num2 && num1 > num3){
            System.out.println("Largest number is: "+num1);
        } else if(num1 < num2 && num2 > num3){
            System.out.println("Largest number is: "+num2);
        }
        else if(num1 < num3 && num3 > num2){
            System.out.println("Largest number is: "+num3);
        }

    }
}
