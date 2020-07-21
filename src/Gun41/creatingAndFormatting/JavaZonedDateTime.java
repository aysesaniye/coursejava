package Gun41.creatingAndFormatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class JavaZonedDateTime {
    public static void main(String[] args) {

        // Başka ülke veya bölgelerin saat dilimine göre zamanı alma

        // Newyork un saat dilimine saati aldım.
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York") );
        ZonedDateTime zdtLocal = ZonedDateTime.now();

        System.out.println("zdtLocal = " + zdtLocal);
        System.out.println("zdt = " + zdt);


//        Set<String> bolgeler=ZoneId.getAvailableZoneIds();
//
//        for (String s: bolgeler) {
//             System.out.println("s = " + s);
//        }

    }
}
