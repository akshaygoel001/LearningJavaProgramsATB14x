package ex_03_Literals;

public class Lab033_Literals {
    public static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10
        System.out.println(age);

        // Binary Literal
        int binary_num = 0b1010; // Binary System
        System.out.println(binary_num);


        // Octal base? -> 8
        int octal = 00101;// 0 * 2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 4+0+1=5
        System.out.println(octal);

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        System.out.println(hex);
        //base 16 color combination are in hex - #28a745
    }
}
