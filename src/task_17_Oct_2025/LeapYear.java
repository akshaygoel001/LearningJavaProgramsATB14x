package task_17_Oct_2025;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        if (year % 100 == 0 && year % 400 == 0 && year % 4 == 0
                || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println(year +" is a leap year");
        } else {
            System.out.println(year +" is not a leap year");
        }
    }
}
