package coding_challenge_16112025;

public class Challenge2 {
    public static void main(String[] args) {
        Student s1 = new Student("Bob",101, 'A');
        System.out.println(s1.display());
    }
}
class Student{
    String name;
    int rollNo;
    char section;

    public Student(String name, int rollNo, char section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    public String display(){
        return "Student: "+this.name+", Roll No: "+this.rollNo+", Section: "+this.section;
    }
}
