package phase01_conditionals.level01_simple;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();


        // TODO: Implement logic to check if positive, negative, or zero
        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        }else{
            System.out.println("Input is not an number");
        }
    }
}
