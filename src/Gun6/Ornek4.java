package Gun6;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {

        // Kullanicidan boy(ondalikli) ve kilo(ondalikli) bilgisini alip ekrana yazdiriniz
        // alip ekrana tek satirda yazdiriniz

        Scanner ekrandanAl = new Scanner(System.in);

        System.out.print("Boyunuz = ");
        double boy = ekrandanAl.nextDouble();

        System.out.print("Kilonuz = " );
        double kilo = ekrandanAl.nextDouble();

        System.out.println("Boy = " +boy+ "\nKilo = " +kilo);



    }
}
