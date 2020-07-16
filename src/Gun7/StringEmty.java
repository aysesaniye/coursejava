package Gun7;

public class StringEmty {
    public static void main(String[] args) {
        //String bos mu degil mi onu kontrol ediyor , sonuc true false

        String str1 = "Hi";
        System.out.println("strl ici bos mu= " + str1.isEmpty());

        String str2 = "";
        System.out.println("strl2 ici bos mu= " + str2.isEmpty());

        String str3 = "";
        System.out.println("strl3 ici bos mu= " + str3.isEmpty());
        boolean bosMu = str3.isEmpty(); //boolean degiskene atanabilir
    }
}