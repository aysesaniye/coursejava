package Gun5;

public class Ornek6 {
    public static void main(String[] args) {

        //sayilar arasi donusum

        int sayi = 5;
        double rakam = 55.67;
        rakam = sayi;          //otomatik rakam =(double) sayi;
        sayi = (int)rakam;    //manuel

        //sayiyi string donusturme
        String yazi = Integer.toString(sayi);
        String yazi2 = Double.toString(rakam);

        System.out.println("yazi = " + yazi);
        System.out.println("yazi2 = " + yazi);


    }
}


