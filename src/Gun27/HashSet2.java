package Gun27;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {

        HashSet<String> hs=new HashSet<>();

        hs.add("Red");
        hs.add("Green");
        hs.add("Blue");
        hs.add("Red");  // Bunu tekrar oldugu icin eklemedi.
        hs.add("red");
        hs.add("Red");
        hs.add("rEd");

        // 1. yol
        System.out.println("hs = " +hs);

        // 2. yol
        for(String s: hs)
        {
            System.out.println("s = " +s);
        }
        // 3. yol
        Iterator gosterge =hs.iterator();
        while (gosterge.hasNext()) // sonraki varsa
        {
            System.out.println("Sonraki eleman = " + gosterge.next());
        }

        hs.remove("Red"); // bir eleman siler
        System.out.println("remove sonrasi hs = " +hs);
        hs.clear();  // seti temizler
        System.out.println("clear sonrasi hs = " +hs);


    }
}
