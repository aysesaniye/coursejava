package Gun31.tasks.task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        // create class student with fields
        // string name, int not
        // Daha sonra 3 tane ogrenci ve notu olusturun. ve ogrencileri bir ArrayList e ekleyin.
        // Daha sonra ogrenci bilgilerini yazdiran bir metod yazarak, ArrayList teki ogrenci bilgilerini dogu yazdiriniz.
        // Daha sonra butun ogrencilerin not ortalamasini bir metod araciligi bularak main de yazdiriniz.

        // 2. kisim
        Student ogr1 = new Student();
        Student ogr2 = new Student();
        Student ogr3 = new Student();

        ogr1.name = "Ahmet";
        ogr1.not = 95;
        ogr2.name = "Ayse";
        ogr2.not = 98;
        ogr3.name = "Kaya";
        ogr3.not = 60;

        ArrayList<Student> ogrenciler = new ArrayList<>();
        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);
        ogrenciler.add(ogr3);

        BilgiYazdir(ogrenciler);

    }

    //3.kisim

    public static void BilgiYazdir(ArrayList<Student>ogrenciler)
        {
            for(Student ogr: ogrenciler)
            {
                System.out.println("ogr.name= " +ogr.name+" Notu=" +ogr.not);

            }
        }
    public static double OrtalamaBul(ArrayList<Student>ogrenciler)
    {
                double ort= 0;
                double toplam= 0;
                for (Student ogr : ogrenciler) {
                    toplam += ogr.not;
                }
                ort=toplam / ogrenciler.size();


                return ort;

                }

    }


//1. kisim
class Student{
    String name;
    int not;
}