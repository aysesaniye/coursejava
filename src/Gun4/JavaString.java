package Gun4;

public class JavaString {
    public static void main(String[] args) {

        //System.out.println("Merhaba Dunya");
        // int sayi = 5;
        String ad = "ismet";
        String soyad = "temur";

        System.out.println(ad);    // ismet
        System.out.println("ad");  // ad
        // -> cift tirnak arasinda yazilmayan her sey degisken kabul edilir,degeri yazilir

        System.out.println(ad+soyad);
        System.out.println("ad"+"soyad");

        System.out.println(ad+ " "+soyad);
        System.out.println("ad"+"soyad");

        //int toplam =a+b;
        String fullName= ad+" "+soyad;
        System.out.println("fullName = "+ fullName);
        int yas = 45;
        String bilgi =ad + " " + soyad + " "+ yas;
        System.out.println(bilgi);


}}
