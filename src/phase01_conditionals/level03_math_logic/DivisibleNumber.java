package phase01_conditionals.level03_math_logic;

import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number to check divisibility by 5");
        double number = sc.nextDouble();
        boolean result = isDivisibleBy5(number);
        System.out.println("Number " + number + " divisible by 5 :" + result);
    }

    public static boolean isDivisibleBy5(Double number) {
        if (number % 5 == 0) {  //return number % 5 == 0;
            return true;
        } else return false;
    }
}
