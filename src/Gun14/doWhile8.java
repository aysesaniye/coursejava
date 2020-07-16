package Gun14;

import java.util.Scanner;

public class doWhile8 {
    public static void main(String[] args) {
        // Kullanicidan 0 girilene kadar sayi isteyiniz.
        // bu soruyu once while ile cozunuz.Sonra do-While

        Scanner oku=new Scanner(System.in);
        int sayi;
      //  System.out.println("Sayi giriniz= ");
      //  int sayi = oku.nextInt();

     //   while(sayi !=0) {
     //   System.out.println("Sayi giriniz= ");
     //   sayi = oku.nextInt();
     //  }

        //burada dongu icine mutlaka ilk kez girilir, islemler yapilir, sonra dongu sarti
        //gecerli ise dongu donmeye baslar
        do {
            System.out.println("Sayi giriniz= ");
            sayi = oku.nextInt();
        }while (sayi !=0);
        }
    }

