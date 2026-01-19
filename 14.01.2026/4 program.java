Linear Search in Array
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}


Reverse an Array
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

Simple Calculator (Switch Case)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(b != 0 ? a / b : "Error"); break;
            default: System.out.println("Invalid");
        }
    }
}

Class and Object Example
class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Ravi";
        s.display();
    }
}


