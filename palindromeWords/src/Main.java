import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bİr kelime girin");
        String kelime = scanner.nextLine();

        if (Palindrome(kelime.toLowerCase())){
            System.out.println("Kelime Palindrom");
        }
        else {
            System.out.println("Kelime palindrom degil");
        }


    }
    public static boolean Palindrome (String kelime){
        int baslangic = 0;
        int son = kelime.length() -1;
        System.out.println(kelime.length());
        System.out.println(son);

        while(son > baslangic){
            if (kelime.charAt(son) != kelime.charAt(baslangic)){
                return false;
            }
            son--;
            baslangic++;
        }
        return true;
    }
}