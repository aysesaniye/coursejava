package Gun6;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 2 sayinin toplamini ekrana yazdiriniz.

        Scanner oku= new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("Ikinci sayiyi giriniz = ");
        int sayi2 = oku.nextInt();

        int toplam = sayi1+sayi2;
        System.out.println("Toplam = " + toplam); //bu sekilde olur.

        //System.out.println("Toplam = "+sayi1 + sayi2); // boyle olmaz.

    }
}
