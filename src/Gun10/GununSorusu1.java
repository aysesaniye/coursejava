package Gun10;

import java.util.Scanner;

public class GununSorusu1 {
    public static void main(String[] args) {

        // 5-Girilen 3 basamakli bir sayinin baamaklarina gore tersini bir sayi olarak bulunuz
        // ekrana yazdiriniz. Ornegin 435 -> 534 sayi olarak bulunacak.

        Scanner oku=new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz= ");
        int sayi=oku.nextInt();

        // 435->534
        //   4x1, 3x1, 5x100

        int birler = sayi % 10; // ilk basamagini verir. -> 5
        int onlar = (sayi / 10 ) %10 ; // (sayi /10 ) -> 43  %10 -> 3
        int yuzler = sayi / 100; // yuzler basamagini verir. -> 4

        System.out.println("birler = "+ birler);
        System.out.println("onlar  = "+ onlar);
        System.out.println("yuzler = "+ yuzler);

        int tersi = birler *100 + onlar *10 + yuzler;
        System.out.println("tersi = "+ tersi);
    }

}
