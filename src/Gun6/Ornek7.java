package Gun6;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        //Kullanicidan username (string)'password (int) ve gizli soruyu (cumle) alip ekrana yazdiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("username");
        String username = oku . nextLine();

        Scanner oku2=new Scanner(System.in);
        System.out.println("password=");
        int password=oku2.nextInt();

        System.out.println("Gizli Soru=");
        String gizliSoru =oku.next(); // next line satir okuma ,


    }
}