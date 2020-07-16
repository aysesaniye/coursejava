package myCalisma;

import java.util.Scanner;

public class bankaHesap {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int sayi = sc.nextInt();
        int bakiye = 1000;
        int islem;

        System.out.println("1: Bakiye Goruntuleme");
        System.out.println("2: Para Yatirma");
        System.out.println("3: Para Cekme");
        System.out.println("4: Sistemden Cikis");

        islem = sc.nextInt();
    }
}