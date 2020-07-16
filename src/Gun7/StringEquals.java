package Gun7;

public class StringEquals {
    public static void main(String[] args) {
        // 2 stringin esit olup olmadiginni kontrol eder, sonuc boolean degiskenidir
        // sonuc boolean degiskendir
        String str = "Merhaba";
        boolean birebirEsitMI = str.equals("Merhaba");

        System.out.println("birebirEsitMi = " + birebirEsitMI);

        System.out.println("birebirEsitMi = " + str.equals("merhaba"));

    }
}
