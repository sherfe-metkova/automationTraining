public class Proffessor {
    int age;
    public String name;
    String university;
    long idNumber;

    public Proffessor() {
        university = "Technical university of Sofia";
    }

    public Proffessor(int age, String name) {
        this();
        this.name = name;
        this.age = age;
    }

    public Proffessor(int age, String name, long id) {
        this(age, name);
        this.idNumber = id;
    }
}
