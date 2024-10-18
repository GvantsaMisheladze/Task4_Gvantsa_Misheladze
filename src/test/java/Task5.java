import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        int guess = 0;

        while (guess != randomNumber){
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
        if (guess > randomNumber){
            System.out.println("Too high! Try again");
        } else if (guess < randomNumber){
            System.out.println("Too low! Try again");
        } else {
            System.out.println("Correct!");
        }
        }
    }
}
