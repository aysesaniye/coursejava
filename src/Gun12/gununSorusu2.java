package Gun12;

import java.util.Scanner;

public class gununSorusu2 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("x degeri =");
        int x= oku.nextInt();

        System.out.println("y degeri =");
        int y=oku.nextInt();

        if (x < -2 || x > 8 || y > 4 || y < 1)
            System.out.println("Disinda");
        else
            if (y < 4 && y > 1 && x < 8 && x > -2)
                System.out.println("Cizgi uzerinde");
    }
}
