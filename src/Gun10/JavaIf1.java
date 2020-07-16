package Gun10;

import java.util.Scanner;

public class JavaIf1 {
    public static void main(String[] args) {
        // Girilen bir sayinin 10 dan buyuk ise ekrana 10 dan buyuk diye yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println(("Bir sayi giriniz = "));
        int sayi = oku.nextInt();

        if (sayi > 10) { // if in icinde yapilacaklar 1 satirda fazla ise susulu parantez sart. 1 tane ise degil
            System.out.println();
        }
    }
}
