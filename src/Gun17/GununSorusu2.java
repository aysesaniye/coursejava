package Gun17;

import java.util.Scanner;

public class GununSorusu2 {
    public static void main(String[] args) {

        // icinde negatif de olabilen sayinin para sembolunun oldugu asagidaki gini 3 tana String okutunuz.
        // okunan bu 3 string icindeki negatif te olabilen sayilari toplatin.
        // Toplam pozitif ise toplami yazdiriin, eger toplam negatif ise sadece -1 yazdirin.

        //String num1 = "$15";
        //String num2 = "$-20";
        //String num3 = "$"30;

        Scanner oku= new Scanner(System.in);
        System.out.println("1.Ucreti giriniz=");
        String strUcr1=oku.nextLine();

        System.out.println("2. Ucreti giriniz");
        String strUcr2=oku.nextLine();

        System.out.println("3.Ucreti giriniz");
        String strUcr3=oku.nextLine();

        int rakamUcr1= Integer.parseInt(strUcr1.replaceAll("[$A-Za-z]", " "));
        int rakamUcr2= Integer.parseInt(strUcr2.replaceAll("[$A-Za-z]", " "));
        int rakamUcr3= Integer.parseInt(strUcr3.replaceAll("[$A-Za-z]", " "));

        int toplam = rakamUcr1+rakamUcr2+rakamUcr3;

        if (toplam > 0)
            System.out.println(toplam);
        else
            System.out.println(-1);

       // System.out.println( toplam > 0 ? toplam : -1);

    }
}
