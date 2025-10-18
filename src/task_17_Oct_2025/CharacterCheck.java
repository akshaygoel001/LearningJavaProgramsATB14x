package task_17_Oct_2025;

public class CharacterCheck {
    //Check if a Character is an Alphabet.
    public static void main(String[] args) {
        char ch = '0';
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " character is alphabet");
        }
        else {
            System.out.println(ch + " character is not an alphabet");
        }
    }
}
