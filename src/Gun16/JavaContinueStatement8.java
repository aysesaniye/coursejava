package Gun16;

import java.util.Scanner;

public class JavaContinueStatement8 {
    public static void main(String[] args) {

        // Kullanicidan 5 adet sayi iateyiniz.
        // Bu sayilardan 5 ile 10 arasindakiler haric,
        // digerlerinin toplamini bulunuz.
        // bu soruyu continue kullanarak cozunuz.

        Scanner oku = new Scanner(System.in);

        int toplam=0;
        for(int i=1;i<=5 ;i++){
            System.out.println("Bir sayi giriniz = ");
            int sayi=oku.nextInt();

            if (sayi > 5 && sayi < 10)
                continue;


            toplam +=sayi;  //toplam=toplam+sayi;
        }
    }
}
