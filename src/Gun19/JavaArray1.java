package Gun19;

import java.util.Scanner;

public class JavaArray1 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 adet sayiyi , giris sirasina gore tersten yazdiriniz.

        Scanner oku=new Scanner(System.in);

        int[] dizi=new  int[5];  //5 tane ama oda numarasi 0,1,2,3,4

        for(int i=0;i<5;i++)
        {
            System.out.print("Sayi giriniz= ");
            dizi[i]=oku.nextInt();
        }

        // terten demek indexleri sondan basa dogru ilerletmek demek.
        // 4,3,2,1
        for (int i=4; i>=0; i--)  //4 yerine dizi.length-1 yazilabilir
        {
            System.out.println("Sayi = " + dizi[i]);

        }
    }
}
