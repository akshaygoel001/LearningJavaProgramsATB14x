package ex_17_OOPs;

public class Lab160_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Akshay");
    }
}

class Student {
    String name;

    // DC
    Student() {
        System.out.println("Default Constructor -> Hi, i am called.");
    }

    // PC
    Student(String name) {
        System.out.println("Parametrised Constructor -> Hi," + name);
    }


    void sleep() {
    }

    void study() {
    }

    void eat() {
    }

}
