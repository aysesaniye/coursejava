package Gun22;

import java.util.Scanner;

public class JavaMethods6 {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi isteyiniz, toplamini bir methodda yaptiriniz, sonucu mainde yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("1.Sayi =");
        int sayi1 = oku.nextInt();

        System.out.println("2.Sayi =");
        int sayi2 = oku.nextInt();

        toplamYaz(sayi1, sayi2);
    }
    // void: geriye birsey gondermeyen yani return olmayan demek
    public static void toplamYaz(int s1, int s2)  // fonksiyondaki degiskenler gonderilen degiskenlerle
    {                                             // ayni isimde olmak zorunda degil, sirasina gore bire bir eslesiyor
        int toplam=s1+s2;
        System.out.println("toplam = " +toplam);

        }

    }

