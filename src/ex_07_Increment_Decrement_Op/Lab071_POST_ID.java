package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a);//11

        // POST increment  = Print first and then increase.
        int a_post = 10;
        int b = a_post++;//11
        System.out.println(a_post);//11
        System.out.println(b);//10

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 11  |  10 | NA
        // 12  |  11  | 10
        // 14  |  11  | 10
    }
}
