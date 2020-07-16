package Gun13;

import java.util.Scanner;

public class switch5 {
    public static void main(String[] args) {
        //Girilen bir sayinin onlar basamaginin degerini yazi ile yazdiriniz.

        Scanner oku =new Scanner(System.in);
        System.out.println("Sayi =");
        int sayi =oku.nextInt();

        // 176 onlar basamagi nasil bulunuz?
        // once 10 bolerim int bolme oldugundan elimde 17 kalir ben 7 ye ulasmak istiyorum
        // sonra cikan sonucu % yaptigimda 10 bolumden kalani yani son rakami verir 7 yi

        int onlarBasamagi = (sayi/10)%10;

        switch (onlarBasamagi) {
            case 0 : System.out.println("sifir");break;
            case 1 : System.out.println("bir");break;
            case 2 : System.out.println("iki");break;
            case 3 : System.out.println("uc");break;
            case 4 : System.out.println("dort");break;
            case 5 : System.out.println("bes");break;
            case 6 : System.out.println("alti");break;
            case 7 : System.out.println("yedi");break;
            case 8 : System.out.println("sekiz");break;
            case 9 : System.out.println("dokuz");break;



        }

    }
}
