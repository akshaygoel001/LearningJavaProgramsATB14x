package task_05_Oct_2025;

import java.util.Arrays;
import java.util.Scanner;

public class String_Reverse_Without_InbuiltFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse :");
        char[] input = sc.next().toCharArray();//akshay
        int i = input.length-1;
        String reverse_output = "";
        while (i >=0){
            reverse_output = reverse_output + input[i];
            i--;
        }
        System.out.println(reverse_output);




    }
}
