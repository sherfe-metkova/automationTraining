import java.util.Scanner;

public class ExercisesHomework3 {

    public static void main(String[] args) {
        //printSumOfNumbers(100);
        //printMultiplicationTable(5);
        //printFactoriel(4);
        //printOddEvenNumbers();
        //doWhileTask();
        //reverseDigits(1234);
        //isPrime(23);
        //printPrimeNumbers();
        printArmstrongNumbers();
    }

    public static void printSumOfNumbers(int a) {
        //1. Write a program that sums all the numbers from 1 to 100.
        int s = 0;
        for (int i = 0; i <= a; i++) {
            s = s + i;
        }
        System.out.println(s);
    }

    public static void printMultiplicationTable(int a) {
        //2. Write a program that by given integer (can be read from the console) prints the multiplication table of that number.
        for (int i = 0; i < a; i++) {
            System.out.println(i + "X" + a + "=" + (i * a));
        }
    }

    public static void printFactoriel(int a) {
        //3. Write a program to find the factorial value of any number entered through the keyboard.
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

    public static void doWhileTask() {
        //4. Write a do-while loop that asks the user to enter two numbers.
        // The numbers should be added and the sum displayed.
        // The loop should ask the user whether he or she wishes to perform the operation again.
        // If so, the loop should repeat; otherwise it should terminate.
        Scanner scanner = new Scanner(System.in);
        Scanner scannerYN = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please provide two numbers and press Enter.");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Sum of numbers is " + (a + b));
            System.out.println("Do you want to continue? Y/N");
            answer = scannerYN.next();
            while (!"y".equalsIgnoreCase(answer) & !"n".equalsIgnoreCase(answer)) {
                System.out.println("Please provide correct input.");
                answer = scannerYN.next();
            }
        } while ("y".equalsIgnoreCase(answer));
    }

    public static void printOddEvenNumbers() {
        //5. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                sumEven = sumEven + i;
            else
                sumOdd = sumOdd + i;
        }
        System.out.println("sum of even is: " + sumEven);
        System.out.println("sum of odd is: " + sumOdd);
    }

    public static void reverseDigits(int num) {
        //6. Write a program that by given integer outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321.
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    public static boolean isPrime(int num) {
        // method that determines whether a number is prime or not
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public static void printPrimeNumbers() {
        // 7. Write a program that prints all prime numbers from 1 to 1000.
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i))
                System.out.println(i + " ");
        }
    }

    public static void printArmstrongNumbers() {
        //8. Write a program to print out all Armstrong numbers between 1 and 1000.
        // If sum of cubes of each digit of the number is equal to the number itself,
        // then the number is called an Armstrong number.
        System.out.println("Armstrong numbers are:");
        for(int i = 0; i<1000; i++) {
            if (isArmstrong(i))
                System.out.println(i);
        }
    }

    public static boolean isArmstrong(int num){
        int temp = num;
        int sum = 0;
        while (temp!=0){
            int digit = temp%10;
            sum += (int) Math.pow(digit,3);
            temp = temp/10;
        }
        return sum == num;
    }
}

