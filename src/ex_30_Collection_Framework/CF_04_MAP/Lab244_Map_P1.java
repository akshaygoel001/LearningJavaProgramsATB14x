package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args) {
//        Map m1 = new Map();
//        Map m1 = new HashMap();
//
//        m1.put("name", "akshay");
//        m1.put("rollno", "akshay");
//        m1.put(true, "akshay");
//        m1.put(3.14, "akshay");

        Map m1 = new HashMap();

        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m1.put("name", "akshay");
        m1.put("rollno", 1);
        m1.put("phone", 987654321);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","akshay");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);

        Map m3 = new TreeMap();
        // Map is key - value
        // name : akshay,
        // rollno : 1
        // phone : 9876543210
        m3.put("name","akshay");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);

    }
}
