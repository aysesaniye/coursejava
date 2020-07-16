package Gun17;

public class Debug0rnek9 {
    public static void main(String[] args) {

        //Programi adim adim calistirip her satirdaki degerleri kotrol etmek
        //icin baslamasini istedigimiz yere breakpoint(kirmizi nokta) konur.
        //RUN yerine DEBUG secilerek calistirilir.program ilk olarak breakpoint de
        //durur ve F8 ile adim adim ilerletilir.Bu sekilde hem degerler izleir
        //hemde nasil calistigini test edebilir.

        int a=10;

        a= 1000;

        a+=100;

        a*=10;

        System.out.println("a = " +a);

    }
}
