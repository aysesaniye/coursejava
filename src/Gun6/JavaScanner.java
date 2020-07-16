package Gun6;

import java.util.Scanner;

public class JavaScanner {
    public static void main(String[] args) {

        int  sayi = 5;  //bunu tanimladigimiz gibi asagida tanimliyoruz.
        Scanner oku = new Scanner(System.in);  //Klavyeden veri girisi yapilacak.

        System.out.println("Bir sayi giriniz=");
        sayi = oku.nextInt(); // okuma islemi burda kursor bekliyor
        System.out.println("sayi = " + sayi);
    }
}
