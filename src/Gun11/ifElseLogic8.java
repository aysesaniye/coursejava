package Gun11;

import java.util.Scanner;

public class ifElseLogic8 {
    public static void main(String[] args) {

        // Girilen 2 sayiyi kullanicidan aldiktan sonra
        // Toplama icin T, cikarma icin C, carpma icin P, bolme icin B
        // harflerini alarak istege uygun olan islemi yaptirip
        // sonucu ekrana yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.println("1.Sayiyi giriniz =");
        int sayi1 = oku.nextInt();

        System.out.println("2.Sayiyi giriniz =");
        int sayi2 = oku.nextInt();

        System.out.println("Toplam icin T\nCikarma icin C\nCarpma icin P\nBolme icin B ye\n basiniz." );
        Scanner oku2 = new Scanner(System.in);
        String islem = oku2.next();

        if(islem.equalsIgnoreCase("T"))
        System.out.println("toplam =" +(sayi1+sayi2));
        else
            if (islem.equalsIgnoreCase("C"))
                System.out.println("cikarma =" +(sayi1-sayi2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("carpma =" +(sayi1*sayi2));
                else
                    if (islem.equalsIgnoreCase("B"))
        System.out.println("bolme =" +(sayi1/sayi2));

    }

}
