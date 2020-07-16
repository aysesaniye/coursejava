package Gun18;

public class JavaArray2 {
    public static void main(String[] args) {

        //dizileri asagidaki sekillerse tanimlayabiliriz
        int[] dizi1=new int[5];  // 5 adet 0,1,2,3,4 indexli bos eleman olusturuldu
        int[] dizi2={5,77,3,786,9,56,6,7,0,-34,6};  // eleman sayisi kadar uzunlukta dizi tanimlandi.
        String[] dizi3=new  String[5];  // String tipinde 5 elemanli ici bos dizi tanimlandi
        boolean[] dizi4=new boolean[4];  // boolean (true-false) tipinde default degerli dizi
        double[] dizi5=new double[5];  // double cinsinden 5 elamanli bir dizi

        for(int i=0;i<dizi1.length;i++)
            System.out.println("dizi1 (int) = " + dizi1[i]);

        for(int i=0;i<dizi2.length;i++)
            System.out.println();
    }
}
