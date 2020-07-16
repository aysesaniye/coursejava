package Gun6;

import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {

        // Kullanicidan kac bilet istedigini(byte) ve sigorta isteyip istemedigini boolean olarak
        // alip ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Kac bilet istiyorsunuz = ");
        byte biletSayisi = input.nextByte();

        System.out.print("Sigorta istiyor musunuz ? ");
        boolean isSigorta = input.nextBoolean();

        System.out.println("Bilet sayisi = "+biletSayisi+"\nSigorta istiyor mu = "+isSigorta);

    }
}
