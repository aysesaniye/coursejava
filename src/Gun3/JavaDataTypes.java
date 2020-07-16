package Gun3;

public class JavaDataTypes {
    public static void main(String[] args) {
         //yorum satiri kisa yolu // : ctrl+/  '  coklu yorum satiri haline getirme /*/  :  ctrl+shift+/

      //  Data Tipleri  : Primitive ve non Primitive Tipler
      //  byte' short, int, long, float, double, char, boolean :ilkel yani temel tipler
      //  Diziler, string, Class :ilkel olmayan tipler,

      //   Tam sayilar icin  default  int
      //  127 kadar ise byte          1 byte
      //  32767 kadar ise short       2 byte
      //  2 milyar int                4 byte
      //  2 milyardan buyuk ise long  8 byte

      // Ondalikli sayilar icin  default  double
      //float  :   32 bit : noktadan sonra  7 sayi tutabiliyor
      // double  : 64 bit : noktada sora  15 hane tutabiliyor.

     //char  : 65000 e kadar  : 2 byte  :unicode harfleri saklar

     // boolean  : 1 bit  : true, false

     /*byte byteDeger=4;
     short shortDeger=3000;
     int intDeger=200000
     long longDeger=123499999;

     float floatDeger=3.14f;
     double doubleDeger =3.14f;

     char charDeger1 ='A'
     char charDeger2 =65;

     boolean boolDeger1 =true
     boolean boolDeger2 =false
      */

        byte byteDeger = 120;
        short shortDeger = 32000;
        int intDeger = 5;
        long longDeger = 61; //l zorunlu degil

        float floatDeger = 5.123456789f; // f zorunlu double dan ayrilmasi icin,
        double doubleDeger = 6.1234567890123456789d; //koyulabilir zorunlu degil

        char charDeger = 'A'; //Karakterler tek tirnakla ataniyor
        char charDeger2 = 65; //karakterler temelde sayi oldugundan sayi degeride atanabilir
        //ekrana yazarken char tipi oldugundan harf  olarak gozukur
        boolean boolDeger = true; // true veya false degeri olabilir

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("byteDeger = " + shortDeger);
        System.out.println("byteDeger = " + intDeger);
        System.out.println("byteDeger = " + longDeger);
        System.out.println("byteDeger = " + floatDeger);
        System.out.println("byteDeger = " + doubleDeger);
        System.out.println("byteDeger = " + charDeger);
        System.out.println("byteDeger = " + charDeger2);
        System.out.println("byteDeger = " + boolDeger);





    }
}
