package Gun32.example.Ex1;

import Gun32.example.Ex1.Rectangle;

public class Task1 {

    // 1-Adim : Rectangle isminde ayri bir dosyada olmak uzere sinif yaziniz.Fields:width,length
    // 2-Cevre : bulmak uzere gerPerimeter isminde bir metod yaziniz.
    // 3-Adim : Dikdortgenin alanini bulan getArea isimli bir metod yaziniz.

    public static void main(String[] args) {
        Rectangle diktortgen= new Rectangle();
        diktortgen.width = 5;
        diktortgen.length = 4;
        Rectangle dikdortgen = null;
        System.out.println("dikdortgen.getPerimeter() = "+ dikdortgen.getPerimeter());
        System.out.println("dikdortgen.getArea() = "+ dikdortgen.getArea());
    }
}
