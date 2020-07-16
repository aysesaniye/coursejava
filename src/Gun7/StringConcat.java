package Gun7;

public class StringConcat {
    public static void main(String[] args) {
        //bir stringe digerini ekler

        String s="Hi";
        System.out.println(s+ " there! ");  //Hi there!
        System.out.println(s.concat(" there! ")); //Hi there!

        String s2 = "everybody";
        System.out.println((s.concat(s2)));
        System.out.println("s= " + s);

        s=s.concat(s2); //degiskenin kendine atarsam degeri degisir ustteki orneklerde atanmadi
        System.out.println("s = " +s);


    }
}
