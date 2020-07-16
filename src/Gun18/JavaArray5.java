package Gun18;

import java.util.Arrays;

public class JavaArray5 {
    public static void main(String[] args) {
        // 5 Elemanli bir dizi tanimlayiniz, 10 a kadar olan sayilardan Random atayarak
        // doldurunuz. ve elemanlari ekrana 2 farkli sekilde yazdiriniz.

        int[] dizi= new int[5];

        for(int i=0;i<dizi.length;i++) {
            dizi[i] = (int) (Math.random() * 10);
        }

        //Ekrana yazdirma 1.yontem

        for(int i=0;i<dizi.length;i++)
        {
            System.out.println("dizi[i]=" + dizi[i]);
        }

        //Ekrana yazdirma 2.yontem
        System.out.println(Arrays.toString(dizi));

        //Ekrana yazdirma 3. yontem : izi degiskeninin icindeki elemanleri deger adini vererek
        // donguye gonderiyor.



        }
    }

