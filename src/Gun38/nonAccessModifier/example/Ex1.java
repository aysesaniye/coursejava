package Gun38.nonAccessModifier.example;

public class Ex1 {
    public static void main(String[] args) {
        // bir dairenin alani pi*r*r dir

        int yaricap=4;

        double alan = 4 * 4 * Constants.pi;

        // kullanicidan alacaginiz saat,dakika ve gun bilgisini
        // saniyeye ceviriniz

        int gun = 23;
        int saat = 7;
        int dakika = 25;

        int saniyeCinsinden =
                Constants.hourInDay *Constants.minuteInHour* Constants.secondInMinute+
                        saat* Constants.minuteInHour* Constants.secondInMinute+
                        dakika * Constants.secondInMinute;
        System.out.println("saniyeCinsinden = " + saniyeCinsinden);
    }
}
