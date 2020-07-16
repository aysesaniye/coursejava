package Gun9;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        //Girilen 2 kelimelik  adve soyadlarin ilk harflerinin
        //hepsini kucuk ve daha sonra buyuk haflerini yaziniz
        // Ahmet Yildiz -> ahmet yildiz

        Scanner oku=new Scanner((System.in));
        System.out.println("Adinizi ve soyadinizi giriniz =");
        String tamAd = oku.nextLine();

        int boslukIndex = tamAd.indexOf("");
        String ilkHarf=tamAd.substring(0,1).toLowerCase();  // a
        String soyadIlkHarf = tamAd.substring(boslukIndex+1,boslukIndex+2);

        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("soyadIlkHarf =" +soyadIlkHarf);

        String yeniTamAd = ilkHarf + //  a
                            tamAd.substring(1, boslukIndex+1)+  //  hmet-
                            soyadIlkHarf + //y
                            tamAd.substring(boslukIndex+2); //ildiz

        System.out.println("yeniTamAd = + yeniTamAd");

    }
}
