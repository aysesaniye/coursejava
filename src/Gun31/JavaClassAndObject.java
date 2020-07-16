package Gun31;

public class JavaClassAndObject {

    public static void main(String[] args) {
        Araba araba1=new Araba();  // Nesne araba sinifindan turetildi

        araba1.model ="toyota camry";
        araba1.motorHacmi=1600;
        araba1.yili=2020;

        System.out.println("araba1.yili= " + araba1.yili);
        System.out.println("araba1.motorHacmi =" + araba1.yili);
        System.out.println("araba1.model = " +araba1.model);

    }
}
// Araba sinifi
 class Araba{
    // propertiies, Attrinutes, fiellds
    String model;
    int yili;
    double motorHacmi;

 }