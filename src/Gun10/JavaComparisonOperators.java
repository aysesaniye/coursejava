package Gun10;

public class JavaComparisonOperators {
    public static void main(String[] args) {

        int a= 50;
        int b= 50;

        System.out.println("a b ye esit mi " + (a==b)); //true
        System.out.println("a b den farkli mi =" + (a!=b)); // false
        System.out.println("a b den buyuk mu = " + (a>b)); // false
        System.out.println("a b den kucuk mu" + (a<b)); // false

        System.out.println("a b den buyuk veya esit mi = + " + (a>=b)); //true
        // 5-Girilen 3 basamakli bir sayinin basamaklarina gore tersini bir sayi olarak bulunuz
        //ekrana yazdiriniz. Ornegin 4535 -> 534 sayi olarak bulunacak.
        System.out.println("a b den kucuk veya esit mi = + " + (a<=b));
    }

}
