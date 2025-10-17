package phase01_conditionals.level04_logical_operators;

import java.util.Scanner;

// 4. Check if a number is divisible by both 3 and 5.
public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double number = sc.nextDouble();
        boolean result = isDivisible(number);
        if (result)
            System.out.println(number + " is divisible by 5 & 3 both.");
        else
            System.out.println(number + " is not divisible by 5 & 3 both.");

    }

    private static boolean isDivisible(double number) {
        return number % 5 == 0 && number % 3 == 0;
    }
}
