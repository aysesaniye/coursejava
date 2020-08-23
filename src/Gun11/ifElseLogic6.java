package Gun11;

import java.util.Scanner;

public class ifElseLogic6 {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunlugunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmali
        // 2) icinde pass kelimesi olmamali
        // 3) en fazla 12 karakter olmali

        Scanner oku =new Scanner(System.in);
        System.out.println("Yeni sifrenizi giriniz");
        String yeniSifre= oku.nextLine();

        if (yeniSifre.length() >= 8 && !yeniSifre.contains("pass") && yeniSifre.length() <=12)
            System.out.println("Tamam");
        else
            System.out.println("Uygun olmayan sifre");


    }
}
