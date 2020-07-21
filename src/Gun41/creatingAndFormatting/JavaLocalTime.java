package Gun41.creatingAndFormatting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class JavaLocalTime {
    public static void main(String[] args) {

        // Tarih icermez sadece saat,dak, san icerir 9.00 ama gibi
        LocalTime time1 = LocalTime.now();  // o andaki zaman

        LocalTime time2 = LocalTime.of(21, 12);
        LocalTime time3 = LocalTime.of(21, 45, 12);

        // o anda alinan bilgileri
        System.out.println(("time1.getHour() = " + time1.getHour()));
        System.out.println(("time1.getMinute() = " + time1.getMinute()));
        System.out.println(("time1.getSecond() = " + time1.getSecond()));
        System.out.println(("time1.getNano() = " + time1.getNano()));

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern(("hh:mm:ss a")); // a: am, pm , localizasyon turkce oldugu icin 00,0S
        System.out.println("time.format(format1) = " + time1.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss"); // HH 24 lu saat sistemine gore
        System.out.println("time1.format(format2 ) = " + time1.format(format2));

        System.out.println("time1 = " + time1);
        LocalTime time4 = LocalTime.now();
        System.out.println("time4 = " + time4);


    }
}
