package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Akshay";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Goel"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Akshay"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("akshay"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("AKSHAY".toLowerCase());

        // 12. toUpperCase()
        System.out.println("akshay".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Akshay Harri    ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Akshay"));


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Akshay");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());




    }
}
