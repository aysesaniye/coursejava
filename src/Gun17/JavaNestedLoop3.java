package Gun17;

public class JavaNestedLoop3 {
    public static void main(String[] args) {
        // 1 den 5 e kadar (5 dahil) olan sayilarin toplamini yazdiriniz.
        // 1 + 1 = 2
        // 1 + 2 = 3
        // 1 + 3 = 4
        // 1 + 4 = 5
        // 1 + 5 = 6

        // 2 + 1 = 3
        // 2 + 1 = 4
        // 2 + 1 = 5
        // 2 + 1 = 6
        // 2 + 1 = 7
        // ......

        for(int i=1 ; i <=5 ; i++)
        {  // dis dongu

            for(int j=1; j<=5 ; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
            System.out.println();
            }








    }
}
