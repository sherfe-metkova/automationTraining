package Abstraction;

public abstract class Human implements Comparable {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {

    }

    public void walk() {

    }

    public abstract void talk();

    @Override
    public int compareTo(Object o){
        return age-((Human)o).age;
    }
}
