package Gun18;

public class JavaArray1 {
    public static void main(String[] args) {

        int sayi;
        int[] dizi1=new  int[5];  //0,1,2,3,4  indexli 5 adet eleman

        System.out.println("dizi1.length = " + dizi1.length);

        for(int i=0; i<dizi1.length; i++) {
            System.out.println("Dizinin " + i + ".Elemani=" + dizi1[1]); // ayni CharAt(i) gibi
        }
        System.out.println(dizi1[4]);
        }
    }

