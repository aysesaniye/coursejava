package Gun38.nonAccessModifier;

public class Students {
    public static void main(String[] args) {
        Student ogr1=new Student("Ali", "Yilmaz");
        Student ogre=new Student("Sadi", "Yildirim");
        Student ogr3=new Student("Deniz", "Kaynak");

  //      ...
  //      ...
  //      ...
  //      ...
        Student ogrenci=new Student("Malik", "Demir");

        System.out.println("Student.ogrenciSayisi = " + Student.ogrenciSayisi);

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogre = " + ogre);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogrenci = " + ogrenci);

    }

    // Static anahtarinin 3 adet kullanim amaci var.
    // 1- Metoda ve field a direk class uzerinden ulasim.
    // 2- Tekrarlanan ifadeler icin hafizayi iyi kullanma.
}
