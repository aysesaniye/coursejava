package Gun7;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        // Soru2 : Kullanicidan tek bir komutla okunan 2 kelimelik ad ve soyadi,
        // (tek okumada ad ve soyadi aliniz -> "Adinizi ve Soyadinizi giriniz")
        // ekrana ilk harfleri ve nokta sekilde
        // yazdiriniz. Ornek Ahmet Yilmaz -> A.Y

        System.out.print("Adiniz ve soyadiniz = ");
        Scanner oku = new Scanner(System.in);
        String adSoyad = oku.nextLine();

        char adIlkHarf = adSoyad.charAt(0);
        int boslukNerde = adSoyad.indexOf(" ");
        char soyadIlkHarf = adSoyad.charAt(boslukNerde+1);

        System.out.println(adIlkHarf+"."+soyadIlkHarf+".");

    }
}
