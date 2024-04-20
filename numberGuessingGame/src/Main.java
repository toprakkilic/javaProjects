import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1,101);
        int guess;
        System.out.println("We will play a game");
        System.out.println("Number is between 1-100");

        do{

            System.out.println("Enter a guess");
            guess = scanner.nextInt();
            if (number < 0 ){
                System.out.println("Number was between 1-100");
            }
            else if (number < guess){
                System.out.println("Guess is too high");
            }
            else if (number > guess){
                System.out.println("Guess is too low");
            }
            else {
                System.out.println("Congrats you found it");
            }
        }while(guess != number);

    }
}