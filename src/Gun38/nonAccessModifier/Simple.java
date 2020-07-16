package Gun38.nonAccessModifier;

public class Simple {

    int a;  // olusturulacak her bir nesnenin kendi degiskeni
    static int b;  // bu static anahtari ile sinifin bir degiskeni oluyor.

    void increase()
    {
        a++;
        b++ ;
    }

    public static void main(String[] args) {
    Simple ornek=new Simple();
    ornek.a=5;

    Simple ornek2=new Simple();
    ornek2.a=7;

    Simple.b = 5;

    Simple.b = 9;

    ornek.increase();   // ornek.a=6 , Simple. b=10
    ornek2.increase();  // ornek2.a 1 artti, sinif da b si 1 artti

        System.out.println("ornek.a " + ornek.a);  // ornek.a = 6
        System.out.println("ornek2.a " + ornek2.a);  // ornek2.a = 8
        System.out.println("Simple.b = " + Simple.b);  // Simple.b = 9
    }
}
