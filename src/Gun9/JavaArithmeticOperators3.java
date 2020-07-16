package Gun9;

public class JavaArithmeticOperators3 {
    public static void main(String[] args) {
       //artirma ve azaltma operatoru
        int a=5;
        int b=2;
        int k=0;

        a++; //a nin degeri bir artir => a=a+1 le ayni -> 6
        ++a; //a nin degerini bir arttirir => a=a+1 le ayni ->7

        k= a++; //++ lar sagda oldugu icin , once k=a calisir, sonra a=a+1 calisir
        k= ++a; //++ lar solda oldugu icin , once a=a+1 calisir, sonra k=a; a=9, k=9

        a--; // a nin degerini bir azaltir => a=a-1 le ayni ->8
        --a; // a nin degerini bir azaltir => a=a-1 ile ayni ->7

        k = a--; //ler sagda oldugu icin once k calisir, sora a=a-1 ;k=7, a=6
        k = --a; //ler solda oldugu icin once a=a-1 calisir, sonra k=a ;a=5,k=5

        // ++ veya -- degiskenin sagindaysa: once islemleri yap , sonra degiskenin degerini 1 artir veya azalt.
        // ++ veya __ degiskenin solundaysa: once degiskenin kendi degerini 1 artir veya azalt sonra islemi yap.
    }
}
