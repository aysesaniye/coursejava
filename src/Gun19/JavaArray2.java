package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray2 {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz 5 adet meyve ismini bir diziye atadiktan
        // sonra elma ismi gecen meyvelerini ekrana yazdiriniz.

        Scanner oku =new Scanner(System.in);
        String[] dizi=new String[5];

        for (int i=0;i<dizi.length;i++)
        {
            System.out.println("Meyve adi giriniz= ");
            dizi[i] = oku.nextLine();
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        for(int i=0;i<dizi.length;i++)
        {
            if (dizi[i].equalsIgnoreCase("elma")) //sadece elma olanlar
                System.out.println(dizi[i]);

            if (dizi[i].toLowerCase().contains ("elma"))  //yerelmasi gibi olanlarda
            System.out.println(dizi[i]);
        }


    }
}
