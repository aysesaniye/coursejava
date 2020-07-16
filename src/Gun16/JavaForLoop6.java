package Gun16;

import java.util.Scanner;

public class JavaForLoop6 {
    public static void main(String[] args) {

        // Girilen bir stringteki a harfi sayisini bulunuz.
        // c harfine sira gelirse donguden cikilsin.

        Scanner oku = new Scanner(System.in);
        System.out.println("Bir cumle giriniz = ");
        String cumle=oku.nextLine();

        int aMiktar=0;
        for(int i=0; i< cumle.length(); i++) {
            if (cumle.charAt(i) == 'a')
                aMiktar++;
            else if (cumle.charAt(i) == 'c')
                break;
            System.out.println("dongu icindeki isleme giren harfler= " + cumle.charAt(i));
        }
        System.out.println("aMiktar = " + aMiktar);
        }


    }

