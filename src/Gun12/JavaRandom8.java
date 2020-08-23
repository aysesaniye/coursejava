package Gun12;

import java.util.Scanner;

public class JavaRandom8 {
    public static void main(String[] args) {

        // Girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisiniz.
        // kullanici bilirse tebrikler yazdiriniz.

        Scanner oku =new Scanner(System.in);
        System.out.println("sayi =");
        int kacaKadarRandomSayi=oku.nextInt();

        int uretilenSayi = (int) (Math.random()*kacaKadarRandomSayi+1);

        System.out.println("Sayi tahmininiz = ");
        int tahmin = oku.nextInt();

        if (uretilenSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedin ki bilemedin ki");

        System.out.println("uretilenSayi = " +uretilenSayi);
    }
}
