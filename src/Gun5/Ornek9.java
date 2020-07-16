package Gun5;

public class Ornek9 {
    public static void main(String[] args) {

        //String oarak verilen karenin 1 kenar uzunlugundan
        //karenin cevresinin uzunlugunu bulunuz.

        String kenarUzunlugu = "5";

        int kenarInt = Integer.parseInt(kenarUzunlugu);

        int Cevre = kenarInt + kenarInt + kenarInt;

        System.out.println("Cevre =" + Cevre);

        // String olarak verilen true veya false degerini, boolean turune
        // cevirerek yaziniz

        String cevapEvet = "true";
        String cevapHayir = "false";

        Boolean cevapE = Boolean.parseBoolean(cevapEvet);
        Boolean cevapH = Boolean.parseBoolean(cevapHayir);

        System.out.println("cevaplariniz = " +cevapE +" - " + cevapH);


    }
}
