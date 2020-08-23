package Gun10;

import java.util.Scanner;

public class JavaIf6 {
    public static void main(String[] args) {

        // Girilen 3 sayidan en buyuk olanini bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz =");
        int sayi1= oku.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int sayi2= oku.nextInt();

        System.out.println("Ucuncu sayiyi giriniz");
        int sayi3= oku.nextInt();

        int enBuyuk=sayi1;

        if (sayi2 > enBuyuk)
        enBuyuk = sayi2;

        if (sayi3 > enBuyuk)
        enBuyuk =sayi3;

        System.out.println("enBuyuk = " +enBuyuk);
    }
}
