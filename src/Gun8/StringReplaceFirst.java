package Gun8;

public class StringReplaceFirst {
    public static void main(String[] args) {
        // ReplaceFirst -> Replace ile ayni sadece ilk bulunani degistirir.
        String text ="Merhaba Dunya";

        System.out.println("orijinal hali = " +text);
        System.out.println("butun a larin nin degistigi hali = " + text.replace( "a" , "e"));
        System.out.println("ilk bulunan a nin degistigi hali = " + text.replaceFirst("e","a"));
    }
}
