package Gun12;

import java.util.Scanner;

public class JavaTernay4 {
    public static void main(String[] args) {
        // Soru : Girilen sayi 50 den buyuk ise 1 , degilse 0 degerini ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("sayi =");
        int sayi= oku.nextInt();

        int sonuc = sayi >50 ? 1: 0;

        System.out.println("sonuc = " + sonuc);


    }
}
