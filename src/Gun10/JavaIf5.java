package Gun10;

import java.util.Scanner;

public class JavaIf5 {
    public static void main(String[] args) {
      //Girilen bir sayinin birler basamagini yazi ile aliniz

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir sayi giriniz = ");
        int sayi = oku.nextInt();
        int birler = sayi %10;

        if (birler == 0) System.out.println("sifir");
        if (birler == 1) System.out.println("bir");
        if (birler == 2) System.out.println("iki");
        if (birler == 3) System.out.println("uc");
        if (birler == 4) System.out.println("dort");
        if (birler == 5) System.out.println("bes");
        if (birler == 6) System.out.println("alti");
        if (birler == 7) System.out.println("yedi");
        if (birler == 8) System.out.println("sekiz");
        if (birler == 9) System.out.println("dokuz");


















    }
}
