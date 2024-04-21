import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if(isPrime(num)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }

    }

    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for(int i = 2 ; i < Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}