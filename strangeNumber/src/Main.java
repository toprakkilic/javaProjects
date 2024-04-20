import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number it has to be 3 digits integer");
        int number = scanner.nextInt();
        int first = number / 100;
        int second = (number /10) % 10;
        int third = number % 10;
        double sum = Math.pow(first , 3) + Math.pow(second , 3) + Math.pow(third ,3);
        System.out.println(number);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(sum);
        if (sum == number){
            System.out.println("Number is a strange number");
        }


    }
}