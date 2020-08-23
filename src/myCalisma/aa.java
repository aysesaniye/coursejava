package myCalisma;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
//        int a =35;
//        int b =23;
//        if(a>b) System.out.println("int 1 is greater than 2");
//        if(a<b) System.out.println("int 1 is smaller than 2");


        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.equals(str2)) System.out.println("String 1 is equal to String 2");
        else  System.out.println("String 1 is NOT equal to String 2");

    }
}
