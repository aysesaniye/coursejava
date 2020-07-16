package Gun12;

import java.util.Scanner;

public class JavaRandom10 {
    public static void main(String[] args) {
        // Kullanicidan alt ve ust degeri tek bir satirda arasinda bosluk olarak (once min bir bosluk
        // Sonra max degeri alarak sayi uretiniz ve ekrana yazdiriniz
        // 34 56 seklinde bir satirda girecek min ve max 1   5 75

        Scanner oku = new Scanner(System.in);
        System.out.println("min max degeri giriniz =");
        String min_max = oku.nextLine();

        int boslukIndex=min_max.indexOf(" ");
        int min =Integer.parseInt((min_max.substring(0, boslukIndex)));
        int max =Integer.parseInt(min_max.substring(0, boslukIndex)+1);

        int randomNumberInRange = (int) (Math.random() * ((max -min) +1));

        System.out.println("randomNumberInRange");

        // Math.random()  -> 0 - 0,9999
        // 0-10 a kadar sayi uretmesini istersem : Math.random*10  -> 0 - 9,999 -> 0,9 -> 10 dahil olmasi icin +1
        // 2 ile 5 arasi min 2 max 5
        // 3 e kadar olan sayilari buluyorum 0-3 + min -> 2 5 e karsilik gelir


    }
}
