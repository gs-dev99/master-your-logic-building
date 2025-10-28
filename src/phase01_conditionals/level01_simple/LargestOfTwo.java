package phase01_conditionals.level01_simple;

import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {
//        int a = 50, b = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (A): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (B): ");
        int b = sc.nextInt();
        sc.close();
        largestOfTwo(a, b);

    }

    private static void largestOfTwo(int a, int b) {
        if (a > b)
            System.out.println("A is Greater than B");
        else if (b > a)
            System.out.println("B is Greater than A");
        else
            System.out.println("A and B both are equal");
    }
}
