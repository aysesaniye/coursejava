package Gun11;

import java.util.Scanner;

public class ifElse1 {
    public static void main(String[] args) {
        //Girilen bir ogrencinin notunun notuna gore 50 den buyuk ise gectiniz.
        //kucuk ise kaldiniz yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.println("Notu giriniz=");
        int ogrNot = oku.nextInt();

        if (ogrNot >= 50) {
            System.out.println("Gectiniz");
            System.out.println("Tebrikler");
        }

        if (ogrNot < 50) {
        }
        //yukaridaki 3 adet ifin yerine asagidaki ayni gorevi daha hizli saglar cuku tek sart
        //kontrol eder asagidaki yapi, yukaridaki her iki if in sartiniz da kontrol eder

        if (ogrNot > 50) {
            System.out.println("Gectiniz");
        }
        System.out.println("Kaldiniz");
    }
        }


