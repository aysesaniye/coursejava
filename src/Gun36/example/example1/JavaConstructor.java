package Gun36.example.example1;

import Gun34.tasks.task1.Student;

public class JavaConstructor {
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
        Student ogrenci3 = new Student(3, "Ali", "Doğan", 9);
        //System.out.println("ogrenci3.name = " + ogrenci3.name);

    }
}