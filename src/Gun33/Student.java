package Gun33;

import Gun34.tasks.task1.Lesson;

import java.util.ArrayList;

public class Student {
    String name;
    int maxAlabilecegiDersSaatMiktari;
    ArrayList<Gun34.tasks.task1.Lesson> studentLessons=new ArrayList<>();

    public static Student createStudent(String name, int maxAlabilecegiDersSaatMiktari)
    {
        Student ogrenci=new Student();
        ogrenci.name=name;
        ogrenci.maxAlabilecegiDersSaatMiktari=maxAlabilecegiDersSaatMiktari;

        return ogrenci;
    }

    public void lessonAdd(Gun34.tasks.task1.Lesson ders)
    {
        int ogrenciToplamDersSaati=0;
        // öğrencinin bu ana kadar aldığı derslerin saatlerinin toplamı
        for(Gun34.tasks.task1.Lesson aldigiDers :  studentLessons){
            ogrenciToplamDersSaati += aldigiDers.hour;
        }

        if ( ogrenciToplamDersSaati + ders.hour < maxAlabilecegiDersSaatMiktari) {
            studentLessons.add(ders);
        }
        else {
            System.out.println(name+" "+ders.name+" Max saati aştınız.ders Eklenemez");
        }
    }

    public void printLessons()
    {
        System.out.println(name+" isimli öğrencinin aldığı dersler");

        int aldigiToplamSaat=0;
        for(Lesson ders: studentLessons)
        {
            System.out.println(ders.name+" "+ders.hour);
            aldigiToplamSaat+=ders.hour;
        }
        System.out.println("aldigiToplamSaat = " + aldigiToplamSaat);

    }
}
