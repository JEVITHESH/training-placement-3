Count Characters (Excluding Spaces)
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c != ' ')
                count++;
        }
        System.out.println(count);
    }
}


Check Number is Positive, Negative or Zero
import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n > 0 ? "Positive" : n < 0 ? "Negative" : "Zero");
    }
}


Print Multiplication Table
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }
}
