package task_26_Oct_2025;

public class WhileLoopNumbersSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first 10 Natural numbers is: "+sum);
    }
}
