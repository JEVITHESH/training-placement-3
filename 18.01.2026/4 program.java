
Find GCD of Two Numbers
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println(a);
    }
}


Find LCM of Two Numbers
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = a, temp = b;

        while (temp != 0) {
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }
        System.out.println((a * b) / gcd);
    }
}


Simple Interest Calculation
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat(), r = sc.nextFloat(), t = sc.nextFloat();
        System.out.println((p * r * t) / 100);
    }
}


Inheritance Example
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
