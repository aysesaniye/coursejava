package Gun23;

import java.util.Scanner;

public class JavaMetod5 {
    public static void main(String[] args) {

        // Kullanıcı bir öğretmendir.
        // Önce ögrencının adı gırılecek,sonra aldıgı farklı mıktardakı notlar gırılecek
        // Ahmet Demir bu okunduktan sonra
        // 80 56 78 90 okutulacak ve ogrencı adı ve ortalaması yazılacak ekrana
        // Ortalama bulma ıslemını bır fonksıyonda yapınız,fakat sonucu yazdırma ıslemını maınde yaptırınız
        //Her ogrencıye farklı sayıda not gırılebılır.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scan.nextLine();

        System.out.println("Enter student's grades: ");
        String grades = scan.nextLine();

        System.out.println("Full Name = " + name);
        System.out.println("Average = " + average(grades));
    }

    public static double average(String grades){
        double sum = 0;
        String [] scores = grades.split(" ");
        for (int i=0;i < scores.length; i++){
            sum += Integer.parseInt(scores[i]);

        }
        return sum/scores.length;
    }
}

