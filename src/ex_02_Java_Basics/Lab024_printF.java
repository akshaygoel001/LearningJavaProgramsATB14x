package ex_02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
//        System.out.println(a);
//        System.out.println(b);

//        System.out.print(a);
//        System.out.print(b);

        System.out.printf("Value of a=%d",a);
        System.out.println();
        System.out.printf("Value of b=%d",b);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d", table, table*1);
        System.out.printf("\n%dx2=%d", table, table*2);
        System.out.printf("\n%dx3=%d", table, table*3);
        System.out.printf("\n%dx4=%d", table, table*4);
        System.out.printf("\n%dx5=%d", table, table*5);
        System.out.printf("\n%dx6=%d", table, table*6);
        System.out.printf("\n%dx7=%d", table, table*7);
        System.out.printf("\n%dx8=%d", table, table*8);
        System.out.printf("\n%dx9=%d", table, table*9);
        System.out.printf("\n%dx10=%d", table, table*10);

    }
}
