package Gun8;

public class StringStartsWith {
    public static void main(String[] args) {
        // StartsWith  :Bir stringin verilen string ile baslayip baslamadigini kontrol eder

        String text ="Merhaba Dunya";

        System.out.println("ME ile basliyor Mu ? = " + text.startsWith("ME"));
        System.out.println("Me ile basliyor Mu ? = " + text.startsWith("Me"));
        System.out.println("M ile basliyor Mu ? = " + text.startsWith("M"));
        System.out.println("k ile basliyor Mu ? +" +text.startsWith("k"));
    }
}
