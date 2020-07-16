package Gun14;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        //Girilen bir sayiya kadar olan sayilarin toplamini bularak yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi=oku.nextInt();

        int sayac=1;
        int toplam=0;
        //7 => 1 2 3 4 5 6 7
        while (sayac <= sayi) {
            toplam = +toplam + sayac; //toplam+=sayac;
            sayac++;
        }
        System.out.println("toplam = " +toplam);
        }

    }

