import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        do{
            number = scanner.nextInt();
            sum += number;
        }while(number != -1);

        System.out.println("your sum is " + sum);
    }
}