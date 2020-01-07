package hw5pragmatic;

public class Person {
    String name;
    int age;
    boolean isMale;

    Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void showPersonInfo(){
        System.out.println("Person's name is: "+ name);
        System.out.println("Person's age is: "+ age);
        System.out.println("Person's gender is male, true/false: "+ isMale);
    }
}
