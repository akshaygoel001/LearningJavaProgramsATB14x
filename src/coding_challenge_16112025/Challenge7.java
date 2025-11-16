package coding_challenge_16112025;

public class Challenge7 {
    public static void main(String[] args) {
        Employees manager = new Manager(60000, 10000);
        Employees developer = new Developer(50, 160);
        System.out.println("Manager Salary: "+manager.salary()+" Developer Salary: "+developer.salary());
    }
}
class Employees{
    public double salary(){
        return 0.0;
    }
}
class Manager extends Employees{
    private double baseSalary;
    private double bonus;
    public Manager(double baseSalary, double bonus){
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    public double salary(){
        return this.baseSalary + this.bonus;
    }

}
class Developer extends Employees{
    private int hourlyRate;
    private int totalHours;
    public Developer(int hourlyRate, int totalHours){
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }
    public double salary(){
        return this.hourlyRate * this.totalHours;
    }
}
