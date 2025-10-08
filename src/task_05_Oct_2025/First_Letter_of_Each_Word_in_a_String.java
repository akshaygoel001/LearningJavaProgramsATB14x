package task_05_Oct_2025;

public class First_Letter_of_Each_Word_in_a_String {
    public static void main(String[] args) {
        String input = "Java Programming Language";
        String output = "";
        String[] array = input.split(" ");
        for (int i = 0 ; i < array.length; i++){
            output = output + array[i].charAt(0);
        }
        System.out.println(output);
    }
}
