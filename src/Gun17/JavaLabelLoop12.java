package Gun17;

public class JavaLabelLoop12 {
    public static void main(String[] args) {
        // ic ice dongulerde, icteki bir degiskenin degerine gore dis donguyu kirmak icin
        //(continue da olabilir) dongulerde isim (etiket yani label) verilir.
        //ve break veya continue calistirilirken bu isim yazilarak istenilen dongu icin
        //etki (break ve continue) olusturulur.

        dis_dongu: for(int i=1; i< 10; i++)
        {

        ic_dongu:    for(int j=1; j<10 ;j++)
            {
                System.out.println("i="+i+", j=" +j);
                {   // dis donguyu j==3 iken asil kirarim
                    if (j == 3)
                        break dis_dongu;
                    ;
                    System.out.println("i=" + i + ", j=" + j);
                }
                // burada j yok, j ic dongude
                System.out.println();
                }
            }
        }
    }

