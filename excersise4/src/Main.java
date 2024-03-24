public class Main {
    public static void main(String[] args) {
        //Parametre olarak integer bir dizi alan ve bu dizi içindeki çift sayıları 2 artıran bir fonksiyon
        //yazın. Bu fonksiyona gönderilen orijinal liste, fonksiyonda yapılan değişikliklerden
        //etkilenmemelidir.

        int[] array = {1,2,3,4,5,6};
        ciftsayiArttirici(array);
        System.out.println(" ");
        arrayYazdir(array);
    }
    public static void ciftsayiArttirici (int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0 ; i < array.length ; i++){
            newArray[i] = array[i];
            if(array[i] % 2 == 0){
                newArray[i] = array[i] + 2;
            }
        }
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(newArray[i]);
        }
    }
    public static void arrayYazdir(int[]array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
