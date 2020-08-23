package Gun10;

import java.util.Scanner;

public class JavaIf4 {
    public static void main(String[] args) {

        // Girilen sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("Sayi giriniz =");
        int sayi = oku.nextInt();

        if (sayi% 2 ==0)
            System.out.println("Sayi cifttir");

        if (sayi% 2 ==1) {
            System.out.println("Sayi tektir.");
    }



    }
}
