package myCalisma;

import java.util.Scanner;

public class ifcal {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);

        System.out.println("Notunuzu giriniz:");

        int note =sc.nextInt();

        if (note > 70) {
            System.out.println("Dersten gectiniz...");
        }
    }
}
