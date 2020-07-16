package Gun37.instanceModifiers.publicModifier.other;

import Gun37.instanceModifiers.publicModifier.same.SearchEngine;

public class EdgeBrowser {
    public static void main(String[] args) {
        // diger paketteki bu constructor a ulasabildim.
        // cunku public

        SearchEngine microsoft = new SearchEngine("explorer");
        microsoft.name="Edge"; // diger paketteki bu fielada ulasabildim

        System.out.println("microsoft = " +microsoft);
    }

}
