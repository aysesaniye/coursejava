package Gun31.example.Ex1;

public class Ex1 {
    // Ayri bir dosya da student class i tanimlayiniz; fields : name, grade
    // Ayri bir dosyada School class i tanimlayiniz; fields: name, adress, principalName, tuitionFees

    public static void main(String[] args) {
        Student ogrenci1=new Student();

        ogrenci1.name= "Ayse";
        ogrenci1.grade=3;

        //1.Yontem
        School okulu=new School();
        okulu.adress="goztepe";
        okulu.name="Maramara Universitesi";
        okulu.principalName="Rektor";
        okulu.tuitionFees=8;

        ogrenci1.schoolInfo=okulu;

        //2.Yontem
        ogrenci1.schoolInfo = new School();
        ogrenci1.schoolInfo.adress="goztepe";
        ogrenci1.schoolInfo.name="Marmara Universitesi";
        ogrenci1.schoolInfo.principalName="Rektor";
        ogrenci1.schoolInfo.tuitionFees=0;

        System.out.println("ogrenci1.name= " + ogrenci1.name);
        System.out.println("ogrenci1.grade= " +ogrenci1.grade);
        System.out.println("ogrenci1.grade= " +ogrenci1.schoolInfo.name);


       // Student ogrenci2=new Student
    }
}
