public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 2; j < 5; j++) {
                if (j ==3)
                    break; //only breaks the inner
                System.out.println (i + "," + j);
            }
        }


    }
}