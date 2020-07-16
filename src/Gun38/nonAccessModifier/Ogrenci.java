package Gun38.nonAccessModifier;
public class Ogrenci {

    String ad;
    String soyad;
    static String okulAd="Yildirim";
    //static kullanim nedeni hafizayi gereksiz tekrarlardan kurtarmak
    public <ad> Ogrenci(String ad, String soyad){
        this.ad = ad;
        this.soyad = soyad;

    }
    void print()
    {
        System.out.println(ad+" "+soyad+" "+okulAd);

        // ogr1.print();
        // ogr2.print();
        // ogr500.print();

        //1- Kural static
        }
    }
