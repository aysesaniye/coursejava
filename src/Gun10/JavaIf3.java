package Gun10;

import java.util.Scanner;

public class JavaIf3 {
    public static void main(String[] args) {
        //Girilen iki sayidan buyuk olanini ekrana yazdiriniz, esit ise esit yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("Birinci Sayiyi giriniz=");
        int sayi1=oku.nextInt();

        System.out.print("Ikinci Sayiyi giriniz");
        int sayi2=oku.nextInt();

        if(sayi1 > sayi2)
            System.out.println("1.Sayi buyuktur : " + sayi1);

        if (sayi2 > sayi1)
            System.out.println("2.Sayi buyuktur : " + sayi2 );

        if (sayi1 == sayi2)
            System.out.println("2 sayi da esittir.");

    }
}
