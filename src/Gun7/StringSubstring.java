package Gun7;

public class StringSubstring {
    public static void main(String[] args) {
        //Substring  :  stringin belli bir bolumunu alma islemi
                       // 012345
        String text = "Merhaba arkadaslar";

        System.out.println("1.bolum = "+ text.substring (1,5));  // 1 nolu indexten 5 e kadar
        System.out.println("2.bolum = "+ text.substring (0,3));
        System.out.println("3.bolum = "+ text.substring(4)); //verilen indexten itibaren sonuna kadar alir

        String strAlinan = text.substring(0,3);  // bu sekilde alinan parca atanabilir


    }
}
