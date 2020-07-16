package Gun37.instanceModifiers.defaultModifier.other;

import Gun37.instanceModifiers.defaultModifier.same.Book;

public class AmazonStore {
    public static void main(String[] args) {
        // Book kitap1=new Book(); // default oldugundan
        // diger paketten ulasilamaz.

        Book kitap2= new Book("kar");
        // constructor a ulasabildim cunku public
    }
}
