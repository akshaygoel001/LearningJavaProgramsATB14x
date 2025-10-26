package task_26_Oct_2025;

public class ForLoopNumbersSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first 10 Natural numbers is: "+sum);
    }
}
