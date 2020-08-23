package Gun36.task1;

import Gun36.tasks.task1.Book;

public class Task1 {
    //Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
    //3 adet Consructor ekleyiniz.
    //Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
    // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.
    public static void main(String[] args) {

        Gun36.tasks.task1.Book book1 = new Gun36.tasks.task1.Book("Mobi Dick", 1934, "Herman Marville");
        Gun36.tasks.task1.Book book2 = new Gun36.tasks.task1.Book("Kavgam", 1945);
        Gun36.tasks.task1.Book book3 = new Book();
        book3.name="Vadideki zambak";

        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();


//        int sayi=5;
//        System.out.println(sayi); // toString yapıyor otomatik olarak

        //2.yazdırma yöntemi
        System.out.println(book1); // book1 in string e çevrilmiş hali, yani toString

        System.out.println(book1.toString()); // aslında bunu yapıyor.

        System.out.println("book1.name = " + book1.name);
        
    }


}
