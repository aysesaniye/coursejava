package Gun6;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        //Kullanicidan adini ve soyadini ayri ayri okutarak alip
        //birlikte ekrana yazdiriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("Adiniz = ");
        String ad = oku.nextLine();

        System.out.print("Soyadiniz = ");
        String soyad = oku.nextLine();

        System.out.println("Adiniz ve Soyadiniz = " + ad +" "+soyad);




    }
}
