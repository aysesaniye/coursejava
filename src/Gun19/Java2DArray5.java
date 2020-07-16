package Gun19;

public class Java2DArray5 {
    public static void main(String[] args) {

        // 2 ders ve 3 ogrencinin notlarini kendiniz tanimlarken 2 boyutlu dizide veriniz
        // Daha sonra ayri bir dongu ile her bir dersin not ortalamsini bulunuz

        int[] dizi1=new  int[5]; // 1 boyutlu dizi tanimlamasi
        int[] dizi2={4,7,18,9,13}; // 1 boyutlu dizi hem tanimlama hem deger atama

        int[][] mat1=new  int[2][3];  //2 boyutlu dizi tanimlamasi
        int[][] mat2={ {65,76,90},{80,66,95} };  // 2 boyutlu dizi hem tanimlama hem deger atama

        //Ekrana yazdirma islemi

        int tumNotlarintoplami=0;
        for (int satir=0;satir < 2; satir++)
        {
            for(int sutun=0; sutun <3; sutun++)
            {
            tumNotlarintoplami+=mat2[satir][sutun];
            }
            System.out.println();
        }
        System.out.println("tumNotlarintoplami = " +tumNotlarintoplami);

        // 1. dersin yani indexe gore 0. dersin not toplami
        int ders1NotToplami=0;
        for(int sutun=0; sutun < 3; sutun++) {
            ders1NotToplami += mat2[0][sutun];
        }

        // 2. dersin yani indexe gore 1. dersin not toplami
        int ders2NotToplami=0;
        for(int sutun=0; sutun <3; sutun++) {
            ders2NotToplami += mat2[1][sutun];
        }
        System.out.println("1.Dersin Ortalamasi = " + (ders1NotToplami/3) );
        }
     }

