package Gun14;

import java.util.Scanner;

public class WhileLoop6 {
    public static void main(String[] args) {
        //Girilen bir sayiya kadar olan sayilardan sadece tek olanlarini ekrana yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.println("sayi giriniz=");
        int sayi=oku.nextInt();

        while ((sayi >0))
        {
            if (sayi%2==1) {
                System.out.println("sayi = " + sayi);
            }

            sayi--; //sayi=sayi-1
            }
        }
    }

