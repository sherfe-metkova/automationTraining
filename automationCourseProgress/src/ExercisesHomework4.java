package Exercises;

public class ExercisesHomework4 {
    public static void main(String[] args) {
        reverseString("EVIL STAR");
        //countGi();
        //compareWords("abe", "abc", "abd");
        fillInBlank("My name is %s. I am %s years old and I am teacher at %s school.", "george", 34, "SHOOL" );
    }

    public static void reverseString(String s) {
        //2. Write a program which reverses a given string
        // (Changes the direction of reading from the last to the first character in the string):
        // Example: “EVIL STAR” → “RATS LIVE”
        StringBuilder builder = new StringBuilder(s);
        System.out.println(builder.reverse());
    }

    public static void countGi() {
        //3. Count the occurrences of the phrase "gi" in the sentences “Maggie is an engineer.
        // Gilbert is an artist.”. Return 2 results - if we do not ignore and if we ignore the case.
        String string = "Maggie is an engineer. Gilbert is an artist.";
        String subString = "gi";
        int startAt = 0;
        int index = 0;
        while (true) {
            index = string.indexOf(subString, startAt);
            if (index == -1) {
                break;
            }
            System.out.println(index);
            startAt = index + 1;
        }
    }

    public static void compareWords(String a, String b, String c) {
        //4. Write a program which by given 3 words will return the first one if we compare the words lexicographically.
        if ((a.compareToIgnoreCase(c) > b.compareToIgnoreCase(c))) {
            System.out.println(b);
        } else if ((b.compareToIgnoreCase(c)) > a.compareToIgnoreCase(c)) {
            System.out.println(a);
        } else
            System.out.println(c);
    }

    public static void fillInBlank(String original, String name, int years, String schoolName) {
        //5. Write a program that accepts 3 parameters and fills
        // with them the blank spaces in the sentences:
        // “My name is ____. I am ___ years old and I am teacher at “________” school.”
        System.out.println(String.format(original, name, years, schoolName));
    }
}