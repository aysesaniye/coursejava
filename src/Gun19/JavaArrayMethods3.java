package Gun19;

import java.util.Arrays;

public class JavaArrayMethods3 {
    public static void main(String[] args) {

        //Arrays.toString(Array) -> dizinin butun elemanlarini yazdirir.

        String[] names={"ahmet","ayse","kaya","deniz"};
        System.out.println((".toString:" + Arrays.toString(names)));

        // Arrays.equals(array1,array2) -> Btun elemanlarin sirasi ile ayni olup
        // olmadigini kontrol eder
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 3};

        System.out.println("a==b " + Arrays.equals(a,b));  // true
        System.out.println("a==c " + Arrays.equals(a,c));  // false

        //Arrays.fill(array, value); butun elemanlara value degerini atar.

        int[] numbers=new  int[5];
        System.out.println("atamadan once degerler:" + Arrays.toString((numbers)));
        Arrays.fill(numbers, 7);
        System.out.println("atamadan sonra degerler:" +Arrays.toString((numbers)));

        // Arrays.binarySearck(array, value) SIRALI bir dizide araan deger var ise
        // index inin verir, yok ise - deger dondurur.

        int[] rakamlar={2,7,4,13,8,12,6,3};
        System.out.println("once : 8 in index i= " +Arrays.binarySearch(rakamlar,8));
        Arrays.sort(rakamlar);
        System.out.println("sonra : 8 in index i= ");

    }
}
