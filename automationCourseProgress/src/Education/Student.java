package Education;

import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable {
    String name;
    String subject;
    private Map<String, Double> scores;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    public Student() {
        grade = 4;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public void upYear() {
        if (isDegree) {
            System.out.println("The student is degree");
            return;
        }
        yearInCollege++;
        if (yearInCollege == 4) {
            isDegree = true;
        }
    }

    double receiveScholarship(double min, double amount) {
        if(grade > min && age < 30) {
            money += amount;
        }
        return money;
    }

    public void addScore(String subject, double score) {
        scores.put(subject, score);
    }

    private double averageScore() {
        double sum = 0;
        for (String key : scores.keySet()) {
            double score = scores.get(key);
            sum += score;
        }
        return sum / scores.size();
    }

    @Override
    public int compareTo(Object o) {
        return (int) (averageScore() - ((Student) o).averageScore());
    }
}
