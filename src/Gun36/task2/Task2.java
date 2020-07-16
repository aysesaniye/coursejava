package Gun36.task2;

public class Task2 {
    // Bir banka class i tanimlayiniz.
    // 3 adet field ekleyiniz.
    // 3 adet constructor ekleyin.
    // toString metodu olusturun.
    // 3 tane nesne olusturup mainde yazdiriniz.

    public static void main(String[] args) {
        Banka banka1 = new Banka("Yapi Kredi", 1900, 1980);
        Banka banka2 = new Banka("Is bankasi", 1960);
        Banka banka3 = new Banka("Ziraat Bankasi");

        System.out.println("banka1 = " + banka1);
        System.out.println("banka2 = " + banka2);
        System.out.println("banka3 = " + banka3);
    }

    }


