package Gun13;

import java.util.Scanner;

public class switch4 {
    public static void main(String[] args) {
        // Kullanicinin girdigi gun sayisina karsilik gelen gun adini yaziniz.
        // 1. gun Pazartesi

        Scanner oku = new Scanner(System.in);
        System.out.println("gunNo");
        int gunNo= oku.nextInt();

         // if (gunNo==1)
         // System.out.println("Pazartesi");
         // else
         // if (gunNo=2
         // System.out.print("Sali")
         //....

        switch (gunNo)
        {
            case 1 : System.out.println("Pazartesi"); break;
            case 2 : System.out.println("Sali"); break;
            case 3 : System.out.println("Carsamba"); break;
            case 4 : System.out.println("Persembe"); break;
            case 5:  System.out.println("Cuma"); break;
            case 6:  System.out.println("Cumartesi"); break;
            case 7:  System.out.println("Pazar"); break;
            default:
                System.out.println("Hatali gun no");



        }
    }
}
