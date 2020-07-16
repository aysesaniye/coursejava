package Gun8;

public class StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi calisir ,farki kritere gore degisir

        String text = "Merhaba Dunya";

        System.out.println("Orijinal hali " + text);
        System.out.println(("a,b,n leri  - yapilmis hali=" + text.replaceAll("[abn]", "-")));
        System.out.println("Buyuk harfleri - yapilmis hali =" + text.replaceAll("[A-Z]", "-"));
        System.out.println("harflerin x yapilmis hali=" +"");

        text.replaceAll("[A-Z]", "X").replaceAll("[a-z]", "x");
    }

    }

