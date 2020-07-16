package Gun7;

public class StringIndexOf {
    public static void main(String[] args) {
        //Verilen karakter(ler)in string  icersindeki baslangic indexini verir.
        //contains den farkli indexini verir , contains ise treu false

        String text="Good";
        System.out.println("G harfinin indexi = "+text.indexOf("G") ); // Indexler 0 dan baslar
        System.out.println("d harfinin indexi = "+text.indexOf("d"));
        System.out.println("H harfinin indexi = "+text.indexOf("H")); // -1 bulunamadi yok
        System.out.println("od harfinin indexi = "+text.indexOf("od")); // var ise ilk harfin indexini verir
        int index = text.indexOf("o"); // int degiskene atanabilir. kucuk o harfi
        System.out.println("index = " +index); // birden fazla var ise ilkini verir

    }
}
