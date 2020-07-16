package Gun8;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz, 3 kelime olusan isim
        //Orn . Ahhet Emin Yilmaz

        Scanner oku = new Scanner(System.in);
        System.out.println("Lutfen Adinizi ve soyadinizi giriniz =");
        String adAd2Soyad=oku.nextLine();

        //Ahmet Emin Yilmaz
        // A : adAdSoyad.charAt(0);
        // E : 1. bosluk karakterinin indexinin 1 fazlasi
        // Y : Son boslugun indexinin 1 fazlasi

        char adIlkHarf = adAd2Soyad.charAt(0);
        char ad2IlkHarf = adAd2Soyad.charAt(adAd2Soyad.indexOf(" ")+1);
        char soyadIlkHarf = adAd2Soyad.charAt(adAd2Soyad.lastIndexOf(" ") +1);

        System.out.println(adIlkHarf+"."+ad2IlkHarf+soyadIlkHarf+".");




    }
}
