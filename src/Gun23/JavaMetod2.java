package Gun23;

public class JavaMetod2 {
    public static void main(String[] args) {

        int sayi1=5;
        int sayi2=7;

        int sonuc=toplambul(sayi1,sayi2);

        Math.max(3,4);  // Bu sekilde yazmamizin hicbir faydasi yok,
                          // cunku islemin sonucu herhangi bir degiskene atanmadi

        int sayi3=7;
        // bana onceki toplamin degeri lazim, su anda sonuca toplamin sonucu geldi

    }

    private static int toplambul(int a, int b)
    {
        int toplam =a+b;
        System.out.println("toplam =" +toplam);

        return toplam;
    }
}

