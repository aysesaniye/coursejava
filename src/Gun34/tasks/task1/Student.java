package Gun34.tasks.task1;

import java.util.ArrayList;

    // bir tür yapısı:class
    public class Student {
        int id;
        String name;
        String surName;
        int classroom;

        //Conructor : yapıcı metod: ilk oluşmada yapılması
        // istenen işlemlerin yazıldığı metod.
        public Student(int id, String name, String surName, int classroom)
        {
            //this : clasın kendisini gösteriyor yani Student ı gösteriyor.
            this.id = id;
            this.name = name;
            this.surName = surName;
            this.classroom = classroom;

            //System.out.println("consructor çalıştı.");
        }

        //2.Yöntem için yazıldı.
//      public static Student createStudent(int id, String name, String surName,int classroom)
//      {
//          Student ogrenci1=new Student();
//          ogrenci1.id=id;
//          ogrenci1.name=name;
//          ogrenci1.surName=surName;
//          ogrenci1.classroom=classroom;
//
//          return ogrenci1;
//      }
    }




