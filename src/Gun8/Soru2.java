package Gun8;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        // Kullanicidan tek seferde alacaginiz 2 kelimelik ad soyadi 2 ayri kelime olarak giriniz
        // ad ayri soyad ayri sekilde ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String adSoyad =oku.nextLine();

        //Ahmet Yilmaz    substring(baslangic index, e kadar - dahil degil)
        int boslukIndex =adSoyad.indexOf("");

        String ad = adSoyad.substring(0,boslukIndex);
        String Soyad = adSoyad.substring(boslukIndex);

        System.out.println("ad = "+ad);
        System.out.println("Soyad = + Soyad");
    }
}
