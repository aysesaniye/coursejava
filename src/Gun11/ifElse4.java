package Gun11;

import java.util.Scanner;

public class ifElse4 {
    public static void main(String[] args) {
        //girilen bir sayinin pozitif mi negatif mi oldugunu yazdiriniz.
        //3 ihtimal var p,n,sifir

        Scanner oku= new Scanner(System.in);
        System.out.println("Sayi giriniz =");
        int sayi =oku.nextInt();

        if (sayi >0)
        System.out.println("pozitif");
        else // 2 ihtimal var negatif veya sifir olabilir.
        if (sayi <0)
            System.out.println("negatif");
        else
            System.out.println("sifir");

    }
}
