package Gun5;

public class Ornek1 {
    public static void main(String[] args) {
        //3 farkli tipte degisken tanimlayiniz,deger atayiniz ve ekrana yazdiriniz

     int sayi =5;
     char ilkHarf= 'A';  //->ben char tipinde bir veri saklayacagim, harf A olacak:
     //bilgisayar unicode A simgesinin karsiligi olan 65 sayisini buluyor.Hafizaya bunu yaziyor.
     //bu hafizaya char olduguna iliskin bir de uyari set ediyor.

     char ilkHarfAyni =65 ;
     //karakter hanesi oldugu kesin olan yere,sayi deger direk olarak ataniyor.
     //Boylece yazdirirken yine 65 i tablodan bakip harf olarak ekrana yazdiriyor.Cunku char tipi.
     boolean cevap = true;

        System.out.println("sayi =" +sayi);
        System.out.println("ilkHarf + " + ilkHarf);
        System.out.println(("cevap" + cevap));

    }
}
