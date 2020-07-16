package Gun16;

import java.util.Scanner;

public class JavaContinueStatement7 {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        //sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cumle giriniz = ");
        String cumle=oku.nextLine();

        for(int i=0; i< cumle.length() ; i++)
        {
            if (cumle.charAt(i) == 'a' || cumle.charAt(i)==' ')
                continue;  //continue calistigi anda artisa direek gider,yani dongunun devami
                           //bu adim calismaz.

            System.out.println(cumle.charAt(i));
        }
    }
}
