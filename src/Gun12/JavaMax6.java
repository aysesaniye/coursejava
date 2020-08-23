package Gun12;

import java.util.Scanner;

public class JavaMax6 {
    public static void main(String[] args) {

        // Math.max yontemi ile girilen 3 sayidan buyuk olanini bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("a degeri =");
        int a=oku.nextInt();

        System.out.print("b degeri =");
        int b= oku.nextInt();

        System.out.print("c degeri =");
        int c= oku.nextInt();

        //int enb = Math.max(a,b);
        //enb = Math.max(enb, c);
        //System.out.println("enb = " + enb);

        System.out.println("enb = " + Math.max( Math.max(a,b),c) );


    }
}
