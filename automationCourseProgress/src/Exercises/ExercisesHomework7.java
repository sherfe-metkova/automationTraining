package Exercises;

import Abstraction.*;
import Education.Student;

public class ExercisesHomework7 {
    public static void main(String[] args){
//        Male h1 = new Male();
//        h1.walk();
//        h1.fixCar();
//
//        Female h2 = new Female();
//        h2.sleep();
//        h2.talk();

        Student s = new Student();
        s.addScore("math", 5.5);
        s.addScore("english", 4.5);

        Student s1 = new Student();
        s1.addScore("math", 6);
        s1.addScore("english", 6);

        System.out.println(s1.compareTo(s));
    }
}

