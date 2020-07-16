package Gun11;

import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        //Girilen vize (%40) ve final (%60) notunu okuyarak ortalamayi bulunuz
        //Ortalama 60 dan buyuk ise gectiniz,tebrikler yazdiriniz, degilse
        //butunlemeye kaldiniz seklinde yazdiriniz

        Scanner oku =new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz=");
        int vizeNotu = oku.nextInt();

        System.out.println("Final notunuzu giriniz=");
        int finalNotu =oku.nextInt();

        double ort =vizeNotu  *0.4 +finalNotu * 0.6;

        System.out.println("ort>=60" +ort);
        if (ort >=60) {
            System.out.println("Gectiniz");
            System.out.println("Tebrikler");
        }
        else
        {
            System.out.println("Kaldiniz");
        }

    }
}
