package Gun7;

public class StringLastIndexOf {
    public static void main(String[] args) {
      // String icinde aranan karakter(ler)in sindan itibaren ilk indexini verir
      // indexOf un sondan olan hali fakat index numaralari degismez.

      String text ="Good";
      System.out.println("En sondaki a nun indexi ="+text.lastIndexOf("o") );
      System.out.println("En sondaki a nun indexi ="+text.lastIndexOf("o") );

      String text2 ="ankara";
        System.out.println("En sondaki a nun indexi = "+text2.lastIndexOf("a"));
        System.out.println("ilk bastan a nun indexi = "+text2.indexOf("a"));

    }
}
