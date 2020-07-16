package Gun6;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {

        //Kullanicidan adini ve soyadini alarak ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.println("Adinizi ve soyadinizi giriniz = ");
        String adSoyad = oku.nextLine();  //Ekrandan bir satir okuyor.

        System.out.println("adSoyad = " + adSoyad);

    }



}
