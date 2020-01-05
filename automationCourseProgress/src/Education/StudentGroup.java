package Education;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup() {
        students = new Student[5];
        freePlaces = 5;
    }

    StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }

    public void addStudent(Student s) {
        if (!s.subject.equalsIgnoreCase(groupSubject)) {
            System.out.println(s.name + " has different subject than the students group.");
            return;
        }
        if (freePlaces == 0) {
            System.out.println("Sorry, there is no free place.");
            return;
        }
        students[students.length - freePlaces] = s;
        freePlaces--;
    }

    public void emptyGroup() {
        students = new Student[5];
        freePlaces = 5;
    }

    String findBestStudent() {
        Student bestStudent = students[0];
        for (int i = 1; i < students.length - freePlaces; i++) {
            if (students[i].grade > bestStudent.grade) {
                bestStudent = students[i];
            }
        }
        return bestStudent.name;
    }

    void printStudentsInGroup() {
        for (int i = 0; i < students.length-freePlaces; i++) {
            System.out.println("Name:" + students[i].name + " age: " + students[i].age);
        }
    }

}
