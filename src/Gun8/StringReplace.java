package Gun8;

public class StringReplace {
    public static void main(String[] args) {

        // Replace : bir stringin icerisindeki istenen karakter(lerin) hepsini,
        // verilen yenisi ile ile degisir.

        String text="Merhaba Dunya";

        System.out.println("orijinal hali = " + text);
        System.out.println(("a larin e olarak degistirilmis hali =" + text.replace( "a","b")));
        System.out.println("ba -> de hali = " + text.replace("ba", "de"));
        System.out.println("Dunya -> Java degistirilmis hali =" + text.replace("Dunya","Java"));
        System.out.println(text.replace('l', 'm'));
    }
}
