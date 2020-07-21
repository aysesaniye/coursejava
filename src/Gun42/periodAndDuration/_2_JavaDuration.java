package Gun42.periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _2_JavaDuration {
    public static void main(String[] args) {

        LocalTime geceYarisi = LocalTime.of(0, 0);
        LocalTime ogleVakti = LocalTime.of(13, 3, 2, 5);

        Duration fark=Duration.between(geceYarisi, ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toMilis() " + fark.toMillis());

        System.out.println("fark.toHours() = " + fark.toHours()); // gun dahil toplam saati verir.
        System.out.println("fark.toDays()= " + fark.toMinutes()); // saat dahil toplam dakikayi verir.
        System.out.println("fark.toDays() = " + fark.toDays() ); // top;am gunu verir.

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart()); // saat bolumunu verir.
        System.out.println("fark.toMinutesPart() = " + fark.toHoursPart()); //
        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());
        System.out.println("fark.toNanosPart() = " + fark.toNanosPart());
    }
}
