package Gun36.example1;

import Gun36.example.example1.Student;

public class JavaConstructors {
    public static void main(String[] args) {

        // bir nesne oluşturup, değerlerini atadık
//        Student ogrenci1=new Student();
//        ogrenci1.id=1;
//        ogrenci1.name="Ayşe";
//        ogrenci1.surName="Yılmaz";
//        ogrenci1.classroom=10;


        // 2.yöntem de
        //Student ogrenci2=Student.createStudent(2,"Ahmet","Demir",11);

        // 3.ve esas yöntem nesne oluşturmak ve değerlerini
        // atamak için
        Gun36.example.example1.Student ogrenci3=new Gun36.example.example1.Student(3,"Ali","Doğan",9);
        System.out.println("ogrenci3.name = " + ogrenci3.name);

        Gun36.example.example1.Student ogrenci4=new Gun36.example.example1.Student(4, "Zeynep", "Toprak");

        Gun36.example.example1.Student ogrenci5=new Gun36.example.example1.Student(5, "Zeynep");

        Gun36.example.example1.Student ogrenci6=new Gun36.example.example1.Student(6);

        Gun36.example.example1.Student ogrenci7=new Student();
        ogrenci7.id=7;
        ogrenci7.name="Veli";
        ogrenci7.surName="Kara";
        ogrenci7.classroom=7;
    }
}
