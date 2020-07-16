package Gun7;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {

        // 2 stringi buyuk kucuk karakter ayrimi yapmadan karsilastir
        // sonuc boolean degiskendir.

        String str = "Merhaba";

        System.out.println("Esit mi = " + str.equalsIgnoreCase("mERHaba"));
        System.out.println("Esit mi = " + str.equalsIgnoreCase("mERHa"));


    }
}