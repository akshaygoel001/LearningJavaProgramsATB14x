package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Array
        v.add("Akshay");
        v.add("Amit");
        v.add("Ram");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Ram"));
    }
}
