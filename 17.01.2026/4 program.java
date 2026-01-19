Remove Spaces from String
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(s.replace(" ", ""));
    }
}

Count Frequency of a Character
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        int count = 0;

        for (char c : s.toCharArray())
            if (c == ch) count++;

        System.out.println(count);
    }
}

Check Perfect Number
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;

        System.out.println(sum == n ? "Perfect" : "Not Perfect");
    }
}
