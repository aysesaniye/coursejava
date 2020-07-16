package Gun3;

public class DataTypes {
    public static void main(String[] args) {
          //yorum satiri kisa yolu // : ctrl+/  ,  coklu yorum satiri haline getirme/*
       /*  : ctrl+shift+/

          byte  : 8 bitlik isaretli sayilar iceren bir veri turudur. -128 ile 127 arasinda bir deger alir
          short : 16 bitlik isaretli sayilar iceren bir veri turudur.-32,768 ile 32,767 arasinda bir deger alir.
          int   : 32 bitlik isaretli sayilar iceren bir veri turudur. -2,147,483,648 ile 2,147,483,647 arasinda bir deger alir
          long  : 64 bitlik isaretli sayilar iceren bir veri turudur. -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasinda bir deger alir.

          float : 32 bitlik IEEE 754 formatinda kayan noktali yani ondalikli sayilari tanimlayan bir veri turudur.
          double : 64 bitlik IEEE 754 firmatinda kayan noktali yani ondalikli sayilari tanimlayan bir veri turudur.

          boolean : Dogru (True) veya Yanlis (False) olmak uzere 2 deger alabilen bir veri turudur.

          char : 16 bitlik Unicode karakterler iceren bir veri turudur. 0-65,535 arasinda bir deger alir.
        */
    }
}


    // Data Tipleri : Primitive ve Non Primitive Tipler
    // byte, short, int, long, float, double, char, boolean : ilkel yani temel tipler
    // Diziler, string Class : ilkel olmayan tpler

    /*  Tam sayilar icin   default int

    127 kadar ise byte,         1 byte
    32767 kadar ise short,      2 byte
    2 milyar int,               4 byte
    2 milyardan buyuk ise long, 8 byte

    Ondalikli sayilar icin default double
    float : 32 bit : noktadan sonra 7 hane tutabiliyor
    double : 64 bit : noktadan sonra 15 hane tutabiliyor.

    char : 65000 e kadar : 2 byte : unicode harfleri saklar 'A' -> 65
    boolean : 1 bit : true,false

   */

   /*
   byte byteDeger = 120;
   short shortDeger = 32000;
   int intDeger = 5;
   long longDeger = 6l;  l zorunlu degil

   float floatDeger = 5.123456789f;   f zorunlu double dan ayrilmasi icin
   double doubleDeger = 6.1234567890123456789d;  d koyulabilir zorunlu degil

   char charDeger = 'A' ;  karakterler tek tirnakla ataniyor
   char charDeger2 =65 ; karakterler temelde sayi oldugundan sayi degeride atanabilir
                      ekrana yazarken char tipi oldugundan harf olarak gozukur

   boolean boolDeger = true; // true veya false degeri alabiliyor

   */