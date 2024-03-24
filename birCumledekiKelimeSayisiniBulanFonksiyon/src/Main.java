public class Main {
    public static void main(String[] args) {
        String cumle = "Merhabalar benim adim cafer boyum kisadir saclarimin rengi kahverengi";

        kacKelime(cumle);
    }
    public static void kacKelime(String kelime){
        String[] kelimeler = kelime.split(" ");

        System.out.println(kelimeler.length);
    }
}