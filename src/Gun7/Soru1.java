package Gun7;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz bir kelimenin son harfini yaziniz.

        System.out.println("Bir kelime giriniz");
        Scanner oku = new Scanner(System.in);
        String okunanKelime = oku.nextLine();

        // uzunluk adedi veriyordu, son index i lenght-1 verecektir.

        int uzunluk = okunanKelime.length();
        char sonKarakter =okunanKelime.charAt(uzunluk-1);

        System.out.println("sonKarakter = " + sonKarakter);
        System.out.println("sonKarakter = " + okunanKelime.charAt(okunanKelime.length()-1));
    }
}
