package Gun16;

public class GununSorusu9 {
    public static void main(String[] args) {

        //1-255 e kadar olan harflerin, sayi ve harf degerini ekrana yazdiriniz.

        for (int i=1; i<=255;i++) {
            char c = (char) i;  // bilgisayar harfleri bilmez , bu sebeple saklayamaz
                                // bu yuzden karakterleri karsilik gelen bir sayi saklar
                                // bu yuzden char yani kaakterler aslinda sayi olarak saklanir
                                // bu ozellikten dolayi char saklanacak yere direk karakterin karsilik gelen sayisi
                                // atanabilir yani A harfi de tanabilir, 65 i char a cevirip de atanabilir.
            System.out.println(i + " - " + c);
        }


        int i=0;
        while (i<255){
            char c=(char)i;
            System.out.println(i+" - "+c);
        }
        }
    }

