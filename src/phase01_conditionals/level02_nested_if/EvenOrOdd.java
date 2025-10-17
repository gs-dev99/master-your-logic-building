package phase01_conditionals.level02_nested_if;

import java.util.Scanner;

//2. Check if a number is even or odd.
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Number");
        int number = sc.nextInt();
        String result = isEvenOrOdd(number);
        System.out.println("Number is : "+ result);

    }

    private static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
