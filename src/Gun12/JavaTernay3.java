package Gun12;

import java.util.Scanner;

public class JavaTernay3 {
    public static void main(String[] args) {

        //Kullanicidan girecegi sayi cift ise bir stringe cift atayiniz
        //tek ise "tek" atayiniz ve ekrana stringi yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.println("sayi =");
        int sayi = oku.nextInt();

        String text= " ";

        // if sayi % (2== 0)
        //    text = "cift"
        // else
        //    text = "tek";

        //ternary sekli (uclu operator sekli)
        text = (sayi % 2 ==0) ? "cift " : "tek";


        //ternary sekli , (uclu operator sekli)
        text = (sayi % 2 == 0) ? "cift" : "tek";
        System.out.println(text);


    }
}
