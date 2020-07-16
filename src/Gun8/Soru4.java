package Gun8;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz
        Scanner oku=new Scanner((System.in));
        System.out.println("Bir string giriniz");
        String text = oku.nextLine();

        boolean boslukVarmi = text.contains(" ");
        System.out.println("boslukVarMi =" + boslukVarmi);

        //Kullanicidan alacagini bir stringin bos olup olmadigini kontrol ediniz.

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi);

        //Kullanicidan alacagini bir stringin olup olmadigini kontrol eder.
        boolean bosMu = text.isEmpty();
        System.out.println("bosmu = " +bosMu);



    }
}
