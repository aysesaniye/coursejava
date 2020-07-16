package Gun27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTreeSet4 {
    public static void main(String[] args) {
        // HashSet, LinkedHashSet, TreSet
        //Hash algoritmasina bagli siralamya gore saklar
        HashSet<String> hs = new HashSet<>();
                hs.add("bir");
                hs.add("iki");
                hs.add("uc");
                hs.add("dort");
                hs.add("bes");
        System.out.println("hs = " + hs);

        // Ekleme sirasina gore
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("ts = " + lhs);

        // Alfabetik siraya gore her sirada saklar
        TreeSet<String> ts = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " +ts);

        // sayisal siraya gore saklama yapar
        TreeSet<String> ts2 = new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts2 = " +ts2);

    }
}
