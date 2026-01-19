5
Count Digits in a Number
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if (n == 0) count = 1;

        while (n != 0) {
            count++;
            n /= 10;
        }

        System.out.println("Digits: " + count);
    }
}


Swap Two Numbers (Without Third Variable)
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}


Find Smallest Element in Array
import java.util.Scanner;

public class SmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int min = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] < min) min = arr[i];

        System.out.println(min);
    }
}


Count Words in a Sentence
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        System.out.println(s.split("\\s+").length);
    }
}

Check Leap Year
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(leap ? "Leap Year" : "Not Leap Year");
    }
}
