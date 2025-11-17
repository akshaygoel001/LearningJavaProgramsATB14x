package coding_challenge_16112025;

public class Challenge14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {};
        for (int i = 0; i < 3; i++){
            if (i == 0){
                try{
                    int c = a / b;
                }
                catch (ArithmeticException e1){
                    System.out.println("ArithmeticException: Cannot divide by zero");
                }
            } else if (i == 1) {
                try{
                    String f = "text";
                    double e = Double.valueOf(f);
                }
                catch (NumberFormatException e3){
                    System.out.println("NumberFormatException: Invalid number format");
                }
            }
            else {
                try{
                    int d = arr[1];
                }
                catch (ArrayIndexOutOfBoundsException e2){
                    System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
                }
            }
        }
    }
}
