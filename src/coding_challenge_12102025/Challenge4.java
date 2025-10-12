package coding_challenge_12102025;

public class Challenge4 {
//    Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//            **Requirements:**
//            - Show the difference between ++i and i++
//            - Show the difference between --i and i--
//            - Print values before and after operations
//    Input: 5
//    Output:
//    Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
    public static void main(String[] args){
        int a = 5;
        int original = a;
        int pre_increment = ++a;
        int post_increment = a++;
        int pre_decrement = --a;
        int post_decrement = a--;
        System.out.printf("Original: %d Pre-increment: %d Post-increment: %d (returned %d) Pre-decrement: %d Post-decrement: %d (returned %d)",original,pre_increment,post_increment,a,pre_decrement,post_decrement,a);


    }

}
