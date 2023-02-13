package ExceptionHandling02;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter to dividend");
            int dividend = scanner.nextInt();

            System.out.println("Enter to divisor");
            int divisor = scanner.nextInt();

            int result = dividend/divisor;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Is not possible to divide by zero");
        }
    }
}
