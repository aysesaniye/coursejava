package Gun8;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringTrim {
    public static void main(String[] args) {

        //trim : stringin basinda ve sonunda olan bosluk karakterlerini temizler

        String text="    Merhaba  Dunya   ";

        System.out.println("orjinal hali = ->" +text+"<-");
        System.out.println("bas ve sondaki bosluklarin temizlenmis hali = ->" + text.trim()+"<-");

    }
}
