public class Main {
    public static void main(String[] args) {
        String cumle = "Gecen gun yolda yuruyorken bir para gordum ve onu yerden allip cuzdanima koydum";
        String[] kelimeler = cumle.split(" ");
        String enKisa = enKisaKelime(kelimeler);
        System.out.println(enKisa);

    }
    public static String enKisaKelime(String[] kelimeler){
        String enKisa = kelimeler[0];
        for (String s : kelimeler) {
            if (enKisa.length() > s.length()) {
                enKisa = s;
            }
        }
        return enKisa;
    }
}