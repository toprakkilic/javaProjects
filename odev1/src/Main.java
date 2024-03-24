import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ogrenci;
        int donemOrtalamasi;
        int secenek;
        int sayac = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merhabalar sinifta kac tane ogrenci oldugunu giriniz");
        ogrenci = scanner.nextInt();
        String[] ogrenciler = new String[ogrenci];
        int[]ogrenciNumaralari = new int[ogrenci];
        int[] vizeNotlari = new int[ogrenci];
        int[] finalNotlari = new int[ogrenci];


        do{
            anamenuyazdir();
            secenek = scanner.nextInt();
            switch (secenek){
                case 1:
                    if(sayac == 1){
                        System.out.println("Zaten ogrenci kaydi yapmissiniz !!! \n\n\n");
                        break;
                    }

                    else{
                    for (int i = 0 ; i < ogrenci ; i++) {
                        System.out.println("Ogrenci " +(i + 1)+ "nin adini giriniz");
                        ogrenciler[i] = scanner.next();
                        System.out.println("Ogrenci " +(i + 1)+ "nin numarasini giriniz");
                        ogrenciNumaralari[i] = scanner.nextInt();
                        System.out.println("Ogrenci " +(i + 1)+ "vize notunu giriniz");
                        vizeNotlari[i] = scanner.nextInt();
                        System.out.println("Ogrenci " +(i + 1)+ "final notunu giriniz");
                        finalNotlari[i] = scanner.nextInt();

                    }
                    sayac = 1;
                    break;
                    }

                case 2:
                    for(int i = 0 ; i < ogrenci ; i++){
                    ogrenciListeleyici(ogrenciler,ogrenciNumaralari,vizeNotlari,finalNotlari,i);
                    }
                    break;


                case 3:
                    ogrenciDonemOrtalamasi(ogrenciler,ogrenciNumaralari,vizeNotlari,finalNotlari,ogrenci);
                break;

                case 4:
                    finalNotu60Alti(ogrenciler,ogrenciNumaralari,vizeNotlari,finalNotlari,ogrenci);
                   break;
                case 5:
                    donemOrtalamasi = donemOrtalamasi(vizeNotlari,finalNotlari,ogrenci);
                    System.out.println(donemOrtalamasi);
                    ortalamaUstunde(ogrenciler,ogrenciNumaralari,vizeNotlari,finalNotlari,ogrenci,donemOrtalamasi);
                    break;

                case 6:
                    minVizeBulucu(vizeNotlari,ogrenci);
                    break;

                case 7:
                    maxFinalBulucu(finalNotlari,ogrenci);

            }
        }
        while(secenek > 0);

    }
    public static void minVizeBulucu(int[]vizeNotlari, int ogrenciSayisi){
        int min = 100;
        for (int i = 0 ; i < ogrenciSayisi ; i++){
            if(vizeNotlari[i] < min){
                min = vizeNotlari[i];
            }

        }
        System.out.println("minimum vize notu : " +min);
    }
    public static void maxFinalBulucu(int[]finalNotlari, int ogrenciSayisi){
        int max = 0;
        for (int i = 0 ; i < ogrenciSayisi ; i++){
            if(finalNotlari[i] > max){
                max = finalNotlari[i];
            }

        }
        System.out.println(max);
    }
    public static void ogrenciListeleyici(String[]ogrenciAdlari ,int[]ogrenciNumaralari, int[]vizeNotlari , int[]finalNotlari , int kacinciOgrenci){
        System.out.printf("ogrencinin adi %s ogrencinin numarasi %d ogrencinin vize notu %d ogrencinin final notu %d\n\n" , ogrenciAdlari[kacinciOgrenci],ogrenciNumaralari[kacinciOgrenci],vizeNotlari[kacinciOgrenci],finalNotlari[kacinciOgrenci]);
    }

    public static void finalNotu60Alti ( String[] ogrenciAdlari ,int[]ogrenciNumaralari ,int[]vizeNotlari,int[] finalNotlari, int ogrenciSayisi){
        for (int i = 0 ; i < ogrenciSayisi ; i++){
            if(finalNotlari[i] < 60){
                ogrenciListeleyici(ogrenciAdlari,ogrenciNumaralari,vizeNotlari,finalNotlari,i);
                System.out.println("final notu 60 altında oldugu icin listelenmistir\n\n\n");
            }
        } 
    }

    public static int donemOrtalamasi ( int[]vizeNotlari , int[]finalNotlari,int ogrenciSayisi){
        int toplam = 0;
        int a;
        for(int i = 0; i < ogrenciSayisi ; i++){
            a = ((vizeNotlari[i] * 4) / 10) + ((finalNotlari[i] * 6) / 10);
            toplam = toplam + a;
        }
        return toplam / ogrenciSayisi;
    }


    public static void ortalamaUstunde (String[] ogrenciAdlari, int[] ogrenciNumaralari, int[]vizeNotlari,int[]finalNotlari,int ogrenciSayisi,int donemOrt){
        int ogrencirt;
        for(int i = 0; i < ogrenciSayisi ; i++){
            ogrencirt =  ((vizeNotlari[i] * 4) / 10) + ((finalNotlari[i] * 6) / 10);
            if (ogrencirt > donemOrt){
                ogrenciListeleyici(ogrenciAdlari,ogrenciNumaralari, vizeNotlari ,finalNotlari, i );
                System.out.println("bu ogrenci ortalamanin ustunde oldugu icin listelenmistir\n\n");
            }
        }

    }

    public static void ogrenciDonemOrtalamasi(String[] ogrenciAdlari ,int[]ogrenciNumaralari, int[]vizeNotlari ,int[] finalNotlari , int ogrenciSayisi){
        int ort;
        for(int i = 0; i < ogrenciSayisi ; i++){
            ort =  ((vizeNotlari[i] * 4) / 10) + ((finalNotlari[i] * 6) / 10);
            System.out.printf("ogrencinin adi %s ongrencinin numarasi %d ogrencinin not ortalamasi %d\n\n\n" , ogrenciAdlari[i] ,ogrenciNumaralari[i], ort);
        }
    }
    public static void anamenuyazdir(){
        System.out.print("Ogrenci menulerine hosgeldiniz\n ");
        System.out.print("1- Ogrecileri kaydetme menusu\n ");
        System.out.print("2- Ogrencileri listeleme menusu\n ");
        System.out.print("3- Ogremncilerin donem sonu notunu bulma menusu\n ");
        System.out.print("4- Final notu 60in altinda olan ogrencileri listeleme menusu\n ");
        System.out.print("5- Donem sonu sinif ortalamasinin altinda kalan ogrencileri listeleme menusu\n ");
        System.out.print("6- Minimum vize notunu bulma menusu\n ");
        System.out.print("7- Maksimum final notunu bulma menusu\n ");
        System.out.println("CIKIS YAPMAK ICIN 0'A BASINIZ");


    }
}


