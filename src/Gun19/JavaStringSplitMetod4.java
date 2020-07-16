package Gun19;

import java.util.Scanner;

public class JavaStringSplitMetod4 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bi cumleyi kelimelerine gore alt alta yazdiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cumle giriniz = ");
        String cumle=oku.nextLine();

        String[] kelimeler= cumle.split(" "); // bosluk karakterine gore boler ve diziye atar.

        for(int i=0; i<kelimeler.length ; i++) {  //length -> dizilerdeki eleman sayisini verir
            System.out.println(kelimeler[i]);
        }

        // 2. yontem foreach
        for(String elemanDegeri : kelimeler)
        {
            System.out.println(elemanDegeri);

        }
    }
}
