package task_10_Oct_2025;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char ch = (char)sc.next().toLowerCase().hashCode();
        if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u' || ch =='v'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
