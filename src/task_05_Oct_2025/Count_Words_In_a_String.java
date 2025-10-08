package task_05_Oct_2025;

public class Count_Words_In_a_String {
    public static void main(String[] args) {
        String input = "Java Programming Language";
        System.out.println("Given string is : "+input);
        String[] array = input.split(" ");
        System.out.println("Number of words in a given string is : "+ array.length);
    }
}
