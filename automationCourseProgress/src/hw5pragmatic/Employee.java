package hw5pragmatic;

public class Employee extends Person {
    double daySalary;

    Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.daySalary = daySalary;
    }

    double calculateOvertime(double hours) {
        if (age < 18)
            return 0;
        else {
            return daySalary / 8 * 1.5 * hours;
        }
    }
    public void showEmployeeInfo(){
        System.out.println("Employee's name is: "+ name);
        System.out.println("Employee's age is: "+ age);
        System.out.println("Employee's gender is male, true/false: "+ isMale);
        System.out.println("Employee's day salary is: "+ daySalary);
    }
}
