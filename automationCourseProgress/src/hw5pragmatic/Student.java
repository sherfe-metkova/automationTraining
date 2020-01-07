package hw5pragmatic;

public class Student extends Person {
    double score;

    Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        this.score = score;
    }

    public void showStudentInfo(){
        System.out.println("Student's name is: "+ name);
        System.out.println("Student's age is: "+ age);
        System.out.println("Student's gender is male, true/false: "+ isMale);
        System.out.println("Student's score is: "+ score);
    }
}
