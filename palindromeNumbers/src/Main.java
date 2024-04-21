import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int number = scanner.nextInt();
        int reversed = reverse(number);

        if (number == reversed){
            System.out.println("Sayilar palindrom");
        }
        else {
            System.out.println("Sayilar palindrom degil");
        }

    }
    public static int reverse (int number){
        int reversed = 0;
        int gecici = number;


        while (gecici != 0){
            reversed = reversed * 10 + gecici % 10;
            gecici = gecici / 10;
        }

        return reversed;
    }
}