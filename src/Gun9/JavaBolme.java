package Gun9;

public class JavaBolme {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("a/b=" + (a/b)); // int iki sayinin bolum sonun tam sayidir
        System.out.println("a/b=" + ((double) a / b)); //ondalikli sonuc istiyorsak degiskenlerinden

        //birisini double veya float a cevirecegiz, 1 tanesi yeterli hassasiyet 15 hane
        System.out.println("a/b ="  +((float) a / b)); //hassasiyet 7 tane

        double c = 3.14;
        double d = 2.1;
        System.out.println("c/d =" + (c/d)); //zaten sayilar double oldugu sonuc double olacaktir

     //   (double) (a / b) =>bu bolum parantezin icinde zaten ondaliksiz gelecektir
     //   (double) a/b => burada sonuc ondalikli gelecektir

    }
}