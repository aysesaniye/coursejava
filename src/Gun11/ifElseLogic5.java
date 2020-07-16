package Gun11;

import java.util.Scanner;

public class ifElseLogic5 {
    public static void main(String[] args) {
        //Girilen bir stringin uzunlugu 10 dan buyukse ve 2 ihtimal var
        //"study" kelimesi geciyorsa ekrana evet yazdirin degilse
        //hayir yazdiriniz.

        Scanner oku =new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String text =oku.nextLine();

        if (text.length() > 10 && text.contains("study"))
        {
            System.out.println("Evet");
        }
        else {
            System.out.println("Hayir");
        }


    }
}
