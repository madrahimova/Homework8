import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int [] intArray = new int []{1, 2, 3};
        double [] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"abc", "def"};

        System.out.println("-");
    }

    public static void task2() {
        System.out.println("Задача 2");

        int [] intArray = new int []{1, 2, 3};
        double [] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"abc", "def"};

        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.printf("%d, ", intArray[i]);
        }
        System.out.printf("%d\n", intArray[intArray.length - 1]);

        for (int i = 0; i < doubleArray.length - 1; i++) {
            System.out.printf(Locale.US, "%f, ", doubleArray[i]);
        }
        System.out.printf(Locale.US, "%f\n", doubleArray[doubleArray.length - 1]);

        for (int i = 0; i < stringArray.length - 1; i++) {
            System.out.printf("%s, ", stringArray[i]);
        }
        System.out.printf("%s\n", stringArray[stringArray.length - 1]);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int [] intArray = new int []{1, 2, 3};
        double [] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"abc", "def"};

        for (int i = intArray.length - 1; i > 0; i--) {
            System.out.printf("%d, ", intArray[i]);
        }
        System.out.printf("%d\n", intArray[0]);

        for (int i = doubleArray.length - 1; i > 0; i--) {
            System.out.printf(Locale.US, "%f, ", doubleArray[i]);
        }
        System.out.printf(Locale.US, "%f\n", doubleArray[0]);

        for (int i =stringArray.length - 1; i > 0; i--) {
            System.out.printf("%s, ", stringArray[i]);
        }
        System.out.printf("%s\n", stringArray[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");

        int [] intArray = new int []{1, 2, 3};

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += 1;
        }
        System.out.println(Arrays.toString(intArray));
    }
}