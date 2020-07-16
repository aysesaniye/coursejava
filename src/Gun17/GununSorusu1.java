package Gun17;

import java.util.Scanner;

public class GununSorusu1 {
    public static void main(String[] args) {
        // bilgisayar 0-10 arasi sayi tutsun(Random). Kullanicidan en fazla 3 hak
        // vererek sayiyi bulmasini isteyiniz.Buldugunda tebrikler yazsin.

        Scanner oku= new Scanner(System.in);

        int tutulanSayi= (int) (Math.random()*10) +1;  //Math.Random() -> 0 - 0,99999  *10 => 0-9 + 1 => 1-10
        int sayac=1;

        while (sayac<=3) {  //for (int sayac<=3;sayac++)

            System.out.println(("Sayiyi tahmin edin="));
            int tahmin = oku.nextInt();

            if (tutulanSayi == tahmin) {
                break;

            } else
                System.out.println("Tekrar");

            sayac++;
        }
        if (sayac ==4)
            System.out.println("Hakkiniz bitti, bulamadiniz.Tutulan sayi =" +tutulanSayi);

                    }
    }

