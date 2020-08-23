package Gun10;

import java.util.Scanner;

public class JavaIf7
{
    public static void main(String[] args) {

        // Girilen bir sayinin onlar basamaginin tek mi cift mi oldugunu bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = oku.nextInt();

        int onlar = (sayi/10)  %10 ; // onlar basamagini veriyor

        if (onlar %2 ==0)
            System.out.println("Cifttir");

        if ( (onlar %2 ==1))
            System.out.println("tektir");

    }
}
