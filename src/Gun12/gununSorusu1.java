package Gun12;

import javax.swing.*;
import java.util.Scanner;

public class gununSorusu1 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("x degeri =");
        int x=oku.nextInt();

        System.out.println("y degeri =");
        int y=oku.nextInt();

        if (x > 0 && y > 0)
        System.out.println("A bolgesinde");
        else
            if(x < 0 && y < 0)
        System.out.println("C bolgesinde");
        else
            if (x < 0 && y > 0)
                System.out.println("B bolgesinde");
            else
                if(x >0 && y > 0)
                    System.out.println("D bolgesinde");
                else
                    System.out.println("Eksen uzerinde");
    }
}
