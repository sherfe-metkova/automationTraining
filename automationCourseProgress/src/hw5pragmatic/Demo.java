package hw5pragmatic;

public class Demo {
    public static void main(String[] args) {
        Person person[] = new Person[10];

        Person maria = new Person("Maria", 30, false);
        person[0] = maria;
        Person george = new Person("George", 45, true);
        person[1] = george;

        Student holly = new Student("Holly", 18, false, 6);
        person[2] = holly;
        Student jessica = new Student("Jessica", 19, false, 4.5);
        person[3] = jessica;

        Employee marc = new Employee("Marc", 32, true, 1522);
        person[4]=marc;
        Employee james = new Employee("James", 23, true, 4500);
        person[5]=james;

//        for (Person p : person) {
//            if (p instanceof Student) {
//                ((Student) p).showStudentInfo();
//                continue;
//            }
//            if (p instanceof Employee) {
//                ((Employee) p).showEmployeeInfo();
//                continue;
//            }
//            if (p instanceof Person) {
//                p.showPersonInfo();
//            }
//
//        }

        for(Person p : person) {
            if(p != null && p instanceof Employee) {
                double overtime = ((Employee) p).calculateOvertime(2);
                System.out.println(p.name + "'s overtime is " + overtime + "\n");
            }
        }

    }
}
