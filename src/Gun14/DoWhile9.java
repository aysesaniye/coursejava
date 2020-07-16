package Gun14;

import java.util.Scanner;

public class DoWhile9 {
    public static void main(String[] args) {
        //Kullanicida x harfi girilene kadar "Ekrana Program calisiyor" yazan
        //ve x girildiginde ise "program bitti" yazan programi yaziniz.

        Scanner oku=new Scanner(System.in);
        String okunan="";

        do {
            okunan = oku.nextLine();
            System.out.println("Program calisiyor");
        }while(!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");

    }
}
