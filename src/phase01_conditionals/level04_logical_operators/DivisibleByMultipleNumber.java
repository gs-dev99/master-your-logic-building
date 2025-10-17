package phase01_conditionals.level04_logical_operators;

import java.util.Scanner;

public class DivisibleByMultipleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number to check divisibility by 5 & 3 both");
        double number = sc.nextDouble();
        boolean result = isDivisible(number);
        if (result)
            System.out.println("Number " + number + " is divisible by 5 & 3 both.");
        else
            System.out.println("Number " + number + " is not divisible by 5 & 3 both.");

    }

    private static boolean isDivisible(double number) {
        return number % 5 == 0 && number % 3 == 0;
    }
}
