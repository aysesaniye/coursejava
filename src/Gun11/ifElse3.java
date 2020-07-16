package Gun11;

import java.util.Scanner;

public class ifElse3 {
    public static void main(String[] args) {
        //Girilen sayinin tek mi cift mi oldugunu yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.println("Bir sayi giriniz=");

        int sayi = oku.nextInt();

        if(sayi%2==0)
            System.out.println("Sayi cift");

        else
            System.out.println("Sayi tektir");



    }
}
