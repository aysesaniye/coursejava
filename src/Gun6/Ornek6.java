package Gun6;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Ornek6 {
    public static void main(String[] args) {

        //Kullanicidan Cadde, Sokak, PostaKodu(int) ve ulke seklinde adres bilgisi olarak yazdiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde :");
        String cadde = oku.nextLine();

        System.out.print("Sokak :");
        String sokak =oku.nextLine();

        Scanner oku2=new Scanner(System.in);
        System.out.print("Posta Kodu :");
        int pk = oku2.nextInt();

        System.out.print("Ulke :");
        String ulke =  oku.nextLine();

        System.out.println(cadde+" "+sokak+" "+" "+pk+" "+ulke);

        //Okuma isleminde klavyeden sadece girilen bilgi degil enter ve diger gorunmeyen
        //karakterler de gittiginden sonraki gelen okuma istegi gorunmez karakterle
        //dolabiliyor bu sebeple veri girilmis gibi kabul edlyor.Bunu cozmenin yolu
        //ya araya ek bir gereksin okuma komutu eklemek ve ya tip degistigininde yeni bir scanner
        //degiskeni tanimlamaktir.

    }
}