package Gun39;

import java.util.ArrayList;

public class ex1 {
    static final  String name="Maximillian";
    static final ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Replace = " +name.replace("i", "o"));
        System.out.println("1.name = "+ name);

  //      name = name.replace("i","o");
  //      System.out.println("2.name = " + name);

        list.add("Ahmet");
        list.add("Alperen");
        System.out.println("Oncr list.toString() = " + list.toString());

  //      list=new ArrayList<>(); // FINAL OLDUGUNDA SADECE YENIDEN OLUSTURMAYA IZIN VERMIYOR,DIGER ISLEMLER YAPILABILII
  //      System.out.println("Sonra list.");
    }
    // Static bir metodun icinde metodun disindan kullanacagimiz her sey static veya
    // new ile yeni olusturulmus olmali.Sebebi: Static bir canli birr yapi
    // oldugundan icide kullanilanlarda o anda erisilebilir canli yani
    // static olmali
}
