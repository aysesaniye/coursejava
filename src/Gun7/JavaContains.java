package Gun7;

public class JavaContains {
    public static void main(String[] args) {
        // Bir stringin icerisinde karakter(ler)in var olup olmadigini kontrol eder.
        // Sonucu boolean degiskeni olarak dondurur.

        String str = "Hello";

        System.out.println("llo var mi = "+ str.contains("llo"));
        System.out.println("o var mi =" + str.contains("o"));
        System.out.println("k var mi =" + str.contains("k"));
    }
}
