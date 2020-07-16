package Gun32.tasks;

public class Task2 {

    // 1.Adım : Ayrı dosyada olmak üzere Customer isimli (fields: name) isimli bir class tanımlayınız.
    // 2.Adım : Ayrı bir dosyada ElectricityAccount isimli (fields : totalKw, rate(double), bill)
    // 3.Adım : Customer a bir ElectricityAccount ekleyiniz
    // 4.Adim : 1 tane musteri olusturunuz, Account u dahil;
    // 5.Adim : Musteriye ait her ay tuketilen enerjiyi toplayacak bir metod yaziniz
    //          tuketimiEkle

    public static void main(String[] args) {
        // 4. Adimda hem musteriyi hem de elektrik aboneligini olusturduk
        Customer musteri1=new Customer();
        musteri1.name="Kaya";
        musteri1.elektrikAbonesi=new ElectricityAccount();
        musteri1.elektrikAbonesi= new ElectricityAccount();
    }
}
