public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial (int x ){
        if (x == 1){
            return  1;
        }
        else if (x == 0){
            return 1;
        }
        else {
            return x * factorial(x-1);
        }
    }
}