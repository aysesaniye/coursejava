package Gun17;

public class JavaNestedLoop8 {
    public static void main(String[] args) {
        // Write program that prints this using loops
        // *
        // **
        // ***
        // ****
        // *****

        for(int satir=1; satir<=5; satir++) // satir kontrolu
        {
            for (int bosluk=5-satir;bosluk >0 ; bosluk--) //bosluk kontrolu
            {
                System.out.print(" ");
            }
            for(int sutun=1;sutun <=satir ; sutun++) //sutun kontrolu
            {
                System.out.print("*");
            }
                System.out.println();
            }
        }
    }

