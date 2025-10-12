package coding_challenge_12102025;

public class Challenge15 {
//    Write a program to find and print all prime numbers between 1 and 100 using loops.
//
//            **Requirements:**
//            - Use nested loops to check for prime numbers
//- A prime number is divisible only by 1 and itself
//- Print all prime numbers in the range 1-100
//            - Optimize the algorithm for better performance
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 100: ");
        for(int i = 1 ; i <= 100 ; i++){
            int count = 1;
            for (int j = 1; j < i ; j++){
                if (i % j == 0 ){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(i+" ");
            }
        }

    }
}
