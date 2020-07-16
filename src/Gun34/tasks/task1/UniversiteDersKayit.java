package Gun34.tasks.task1;

public class UniversiteDersKayit {

    // Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    // Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    // öğrencilere eklenecek.
    // 1- Adım : Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız : fields: name, hour
    // 2- Adım : Ders oluşturma metodunu yazınız.create Lesson.
    // 3- Adim : 3 adet ders tanimlayiniz.
    //  mat101 6 saat, fiz101 4 saat, java101 6 saat
    // 4- Adim : Student isminde yeni bir class tanimlayiniz
    //           fields : name, maxAlabilecegiDersMiktari
    // 5- Adim : Ogrenci olusturmayi bir metod ile yaziniz.createStudent
    // 6- Adim : 2 adet ogrenci olusturunuz:
    //          Adi : Mehmet, maxAlabilecegiDersSaatMiktari=20 olsun
    //          Adi : Ayse, maxAlabilecegiDersSaatMiktari=12
    // 7- Adim : Ogrenciye ders eklemek icin bir dersListesi tutacak bir
    //          field ekleyiniz: studentLessons adinda
    // 8- Adim : Ogrenciye ders ekleyen LessonAdd isimli bir metod yaziniz;
    // fakat ders eklerinirken toplam ders saat miktari ogrencinin alabilecegi saat
    // miktarini asmasin,asarsa uyari versin.
    // yani ogrencinin alabilecegi max saat miktarina baksin, gecmeyecekse eklesin.
    // 9- Adim : Her ogrencinin aldigi dersleri yazan bir metod yaziniz.ve
    //          dersleri yazdiriniz.


    public static void main(String[] args) {

        //   Lesson ders=new Lesson();
        //   ders.name="Math101";
        //   ders.hour=3;

        //   Lesson ders2=new Lesson():

             // metod static oldugundan nesne tanimlanmasina gerk kalmadan
             // direk cagrilabiliyor.asagidaki gibi
             Lesson mat101=Lesson.createLesson("mat101", 6);
             Lesson fiz101=Lesson.createLesson("fiz101", 4);
             Lesson java101=Lesson.createLesson("java101", 6);

             Student mehmet = Student.createStudent("Mehmet", 20);
             Student ayse = Student.createStudent("Ayse", 12);

             mehmet.lessonAdd(mat101);
             mehmet.lessonAdd(fiz101);
             mehmet.lessonAdd(java101);

             ayse.lessonAdd(mat101);
             ayse.lessonAdd(fiz101);
             ayse.lessonAdd(java101);

    }


}
