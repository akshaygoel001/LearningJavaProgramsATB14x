package coding_challenge_16112025;

public class Challenge15 {
    public static void main(String[] args) {
        validateAge(15);
        validateAge(25);

    }
    static void validateAge(int age) {
        if (age > 18){
            System.out.println("Age is valid: "+age);
        }
        else {
            new InvalidAgeException(age);
        }
    }
}
class InvalidAgeException{
    public InvalidAgeException(int age) {
        System.out.println("InvalidAgeException: Age must be 18 or above. Provided age: "+age);
    }

}
