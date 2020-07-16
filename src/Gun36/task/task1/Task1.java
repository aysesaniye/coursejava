package Gun36.task.task1;

public class Task1 {
    // Ayri bir Book clasi yaziniz.fields: name,publishYear,autor
    // 3 adet Costructor ekleyiniz.
    // Kitaplarin ozelliklerini tek tek bir satirda yazdiran metod ekleyiniz.
    // 2 adet kitabi farkli constructor la olusturup, mainde yazdiriniz.
    public static void main(String[] args) {

        Book book1 = new Book("Mobi Dick", 1934, "Herman Marville ");
        Book book2 = new Book("Kavgam", 1945);
        Book book3 = new Book();
        book3.name="Vadideki Zambak";

        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();

        // int sayi=5;
        // System.out.println(sayi); // toString yapiyor otomatik olarak

        //2.yazdirma yontemi
        System.out.println(book1); // book1 in stringe cevrilmis hali, yani toStrig

        System.out.println((book1.toString())); // aslinda bunu yapiyor


    }
}


