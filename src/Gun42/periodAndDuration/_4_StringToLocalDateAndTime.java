package Gun42.periodAndDuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _4_StringToLocalDateAndTime {
    public static void main(String[] args) {

        String strDate="01 25 2020";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM dd yyyy"); // String degeri tarihe cevirmek icin format belirledik
        LocalDate tarih = LocalDate.parse(strDate, format);                   // Stringin formati bu formata uygun olmali.parse ile cevirdik

        System.out.println("tarih = " + tarih);

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("MM.dd.yyyy"); // Ekrana yazdirma formati belirledik.
        System.out.println("tarih.format(format1) = " + tarih.format(format1)); // istedigimiz formatta yazdirdik.

        String strTime = "12:49";
        LocalTime time = LocalTime.parse(strTime); // parse ile string olan zaman bilgisi LocalTime tipi gercek zaman degiskenine
        System.out.println("time = " + time);      // cevirdik.
    }
}
