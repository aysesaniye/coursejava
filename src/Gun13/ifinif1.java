package Gun13;

import java.util.Scanner;

public class ifinif1 {
    public static void main(String[] args) {
        // Girilen bir sayininn once 100 den kucuk ise, 100 den kucuk yazsin
        // devaminda 50 den kuucuk ise 50 den kucuk yazsin
        // devaminda 25 den kucuk ise 25 den kucuk yazsin.

        Scanner oku = new Scanner(System.in);
        System.out.println("sayi =");
        int sayi = oku.nextInt();

        if (sayi < 100) {
            System.out.println("50 den kucuk");

            if (sayi < 50) {
                System.out.println("50 den kucuk");

                if (sayi < 25) {
                    System.out.println(("25 den kucuk"));
                }
            }
        }
    }
}
