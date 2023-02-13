package ExceptionHandling01;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to score");
        double score = scanner.nextDouble();
        checkStore(score);
    }

    private static void checkStore(double score) {
        if(0 < score && score < 50.00){
            System.out.println("Average score");
        } else if (50.00 < score && score < 100.00){
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }
}
