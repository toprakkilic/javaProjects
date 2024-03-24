public class Main {
    public static void main(String[] args) {
        int[] array = {40,40,40,50,50,30,30,20,20,45,45,45,55,55,55,55};

        enCokTekrarEdenSayi(array);
    }

    public static void enCokTekrarEdenSayi(int[]array){
        int count;
        int maxCount = 0;
        int enCokTekrar = 0;

        for(int i = 0 ; i < array.length; i++){
        count = 0;

        for( int j = 0 ; j < array.length ; j++){
            if( array[i] == array[j]){
                count++;
            }
        }

        if(count > maxCount){
            maxCount = count;
            enCokTekrar = array[i];
        }


        }
        System.out.println(enCokTekrar);
    }
}