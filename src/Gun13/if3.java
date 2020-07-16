package Gun13;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) { //katsayilari verilen 2 bilinmeyenli denklemin koklerini bulunuz

        // Cozum adimlari
        // kullanicidan a,b,c yi okutun.
        // Delta = b*b - 4*a*c
        // Delta > 0 => 2 tane kok vardir x1=(-b + kok(d)) / (2*a) ,x2= (-b -kok(d)) / (2*a)
        // Delta =0 => 1 tane kok vardir x= -b/2a
        // Delta  < 0 ise kok yoktur.

        Scanner oku =new Scanner(System.in);
        System.out.println("a =");
        int a= oku.nextInt();
        System.out.println("b =");
        int b= oku.nextInt();
        System.out.println("c =");
        int c=oku.nextInt();

        int d =b*b -4*a*c;

        if (d > 0) {
            System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
            System.out.println("x1 = " + ((-b - Math.sqrt(d)) / (2 * a)));
        }
        else
            if(d ==0) {
                System.out.println("x = " + (b / 2 * a));
            }
            else
                System.out.println("kok yoktur");


    }




    }
