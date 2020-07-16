package Gun14;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {
        //Girilen bir sayiya kadar olan sayilarin toplamini bularak yazdiriniz.
        // girilen sayi dahil, ayri bir sayac degiskeni kullanmayiniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("sayi giriniz =");
        int sayi=oku.nextInt();

        int toplam=0;
        // 1 2 3 4 5 6 7    7 icin onceki soruda
        // 7 6 5 4 3 2 1
        while ((sayi > 0))
        {
            toplam=toplam + sayi;
                    sayi--;
            System.out.println("toplam= " +toplam);
        }
    }
}
