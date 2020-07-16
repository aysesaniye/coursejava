package Gun5;

public class Ornek11 {
    public static void main(String[] args) {

        // string olarak verilen Gece ve Gunduz hava sicakligi bilgisinin toplamini
        // yazdiriniz.

        String geceStr = "10";
        String gunduzStr = "25";

        int geceDerece = Integer.parseInt(geceStr);
        int gunduzDerece = Integer.parseInt(gunduzStr);

        int toplamDerece = geceDerece + gunduzDerece;

        System.out.println("toplamDerece = " + toplamDerece);

    }
}
