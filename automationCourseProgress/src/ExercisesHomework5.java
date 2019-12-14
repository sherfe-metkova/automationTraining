import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ExercisesHomework5 {
    public static void main(String[] args) {

        int[] intArray = new int[]{1, 23, 53, 77, 0};

        List<Double> list = new ArrayList<Double>() {{
            add(1.6);
            add(2.88);
            add(3.8);
        }};

        Queue<String> q = new LinkedList<String>();
        q.add("Honda");
        q.add("Opel");
        q.add("Mazda");

        int[] intArrayEmpty = new int[5];

        int[][] arr = new int[5][5];

        //sumOfItemsArray(intArray);
        //sumOfItemsList(list);
        //copyArray(intArray, intArrayEmpty);
        //reverseArray(intArray);
        //demonstrateQueue(q);
        //insert(intArray, 4, 88);
        twoDimensionalArray(arr);
    }

    public static void sumOfItemsArray(int arr[]) {
        //1.Write a Java program to sum values of an int array.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    private static void sumOfItemsList(List<Double> list) {
        //2.Write a Java program to sum values of an List of Double.
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println(sum);
    }

    public static void copyArray(int intArray1[], int intArray2[]) {
        //3.Write a Java program to copy an array to another one.
        int temp;
        for (int i = 0; i < intArray1.length; i++) {
            intArray2[i] = intArray1[i];
            System.out.print(intArray2[i] + ", ");
        }
    }

    public static void reverseArray(int arr[]) {
        //4.Write a Java program to reverse an array of integers.
        int temp = 0;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for(int i:arr){
            System.out.println(arr[i]+ " ");
        }
    }

    public static void insert(int arr[], int position, int value) {
        //5.Write a Java program to insert an element (at specific position) into an array. Repeat the same for List<Integer> collection;
        arr[position] = value;
        System.out.println(String.format("Inserted value %s at position %s", value, position));
        System.out.println("Array after insertion is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.format("%s ", arr[i]));
        }
    }

    public static void demonstrateQueue(Queue<String> queue) {
        //6.Write a programs which adds to a Queue<String> 4 cars. Demonstrate difference between peek(), poll(), and remove() methods.
        System.out.println("Head of queue is: " + queue.peek());
        System.out.println("Return and remove an item " + queue.poll());
        System.out.println("Removes item " + queue.remove());
        System.out.println("New head of queue is " + queue.peek());
    }

    public static void twoDimensionalArray(int arr[][]) {
        //7.Write a program which declares a 2-dimensional array (5*5) and writes the numbers from 1 to 25 in it.
        // Print it on the console row by row.
        int count=1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    //8. Write a program which returns the min and max number from array of integers. Repeat the same for a List<Integer>.
    //9.  Write a program which sorts an array of integers.

}

