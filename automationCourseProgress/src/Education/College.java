package Education;

public class College {
    public static void main(String[] args) {
        Student maria = new Student("Maria", "Informatics", 32);
        Student georgi = new Student("Georgi", "Informatics", 28);

        maria.grade=6;
        georgi.grade=5;

        System.out.println("Maria's year in college is " + maria.yearInCollege);
        maria.upYear();
        georgi.upYear();
        System.out.println("Maria's year in college is " + maria.yearInCollege);

        System.out.println("Georgi's scholarship is " + georgi.money);
        georgi.receiveScholarship(3, 300);
        maria.receiveScholarship(3, 100);
        System.out.println("Georgi's scholarship is " + georgi.money);

        StudentGroup informatics = new StudentGroup("Informatics");
        informatics.addStudent(maria);
        informatics.addStudent(georgi);
        System.out.println(informatics.students[0].name);

        String bestStudent = informatics.findBestStudent();
        System.out.println("Best student is "+bestStudent);

        informatics.printStudentsInGroup();

    }
}
