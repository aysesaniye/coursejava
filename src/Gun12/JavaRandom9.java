package Gun12;

import java.util.Scanner;

public class JavaRandom9 {
    public static void main(String[] args) {
        //Kullanicidan alt ve ust degeri isteyerek random sayi uretiniz
        //ve uretilen sayiyi ekrana yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.println("Alt deger =");
        int min= oku.nextInt();

        System.out.println("Ust deger =");
        int max= oku.nextInt();

        int numberInRange = (int) (Math.random() * ((max - min) +1)) + min;

        //3 7 arasi uretmek istersek
        // max deger icin bu = 0,1 * 5 => 0,5 + 3 min 3
        // max deger icin bu = 0,99 * 5 => 0,99 * 5
    }
}
