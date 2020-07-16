package Gun37.instanceModifiers.publicModifier.same;

public class ChromeBrowser {
    public static void main(String[] args) {

        // public oldugundan rahatlikla ulasabiliyorum ayni paket icinden.
        SearchEngine google=new SearchEngine("crome");
        google.name = "Crome";  // public

        System.out.println("google= " +google);
        // toString metoduna gider o da public
    }
}
