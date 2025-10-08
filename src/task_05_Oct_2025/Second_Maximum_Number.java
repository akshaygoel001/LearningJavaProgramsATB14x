package task_05_Oct_2025;

public class Second_Maximum_Number {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for (int i:numbers){
            if (numbers[i] > max){
                sec_max = max;
                max = numbers[i];
            }
            else {
                if (numbers[i] > sec_max){
                    sec_max = numbers[i];
                }
            }
        }
        //System.out.println("Maximum number : "+max);
        System.out.println("Second Maximum number : "+sec_max);
    }
}
