package Gun42.periodAndDuration;

import java.time.LocalDate;

public class _3_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);

        boolean after = bugun.isAfter(dun); // bugun dunden sonra mi? true
        System.out.println("after = " + after);

        boolean before = bugun.isBefore(dun); // bugun dunden once mi? false
        System.out.println("before = " + before);

        boolean equal = bugun.isEqual(dun); // bugun dun e esit mi? false
        System.out.println("equal = " + equal);

        boolean leapYear = bugun.isLeapYear(); // Artik yil mi?
        System.out.println("leapYear = " +leapYear);

        int fark = bugun.compareTo(dun.plusYears(2)); // 2 tarih arasindaki farkin en buyuk parcasi arasindaki farki verir.
        System.out.println("fark = " +fark);

//        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
//        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
//        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için

    }
}
