import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list;

        list = prime(4,10);

        for (int a : list){
            System.out.println(a);
        }
    }

    public static ArrayList<Integer> prime (int num1 ,int num2){
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num1 ; i<num2 ; i++){
            for (int j = 2 ; j < num2 ; j++){
                if (i % j == 0 && i >j){
                    counter++;
                }
            }
            if (counter == 0){
                list.add(i);

            }
            counter = 0;
        }
        return list;
    }
}