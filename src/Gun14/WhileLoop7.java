package Gun14;

import java.util.Scanner;

public class WhileLoop7 {
    public static void main(String[] args) {
        //Kullanicidan 5 sayi isteyiniz, bu sayilardan en buyugunu bularak yazdiriniz.

        Scanner oku = new Scanner(System.in);

        int enb =0;
        int sayac=1;
        while(sayac<= 5) {
            System.out.println("sayi giriniz =");
            int sayi = oku.nextInt();

            //   if (sayi > enb)
            //       enb = sayi;
            enb = Math.max(enb, sayi);

            sayac++;
        }
        System.out.println("enb = " +enb);
        }



    }

