package myCalisma;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {

        String username ="yazilim bilimi";
        String password ="12345";

        Scanner sc = new Scanner(System.in);
        System.out.println("username:");

        String usernamer = sc.nextLine();
        System.out.println("password:");

        String use =sc.nextLine();

       if (! (username.equals(usernamer)) && !(password.equals(usernamer))) {
            System.out.println("Kullanici adi ve parola yanlis");
        }
        else if ((username.equals(usernamer))&&!(password.equals(usernamer))) {
            System.out.println(("Parola yanlis"));

        }
        else if(!(username.equals(usernamer))&& (password.equals(usernamer))) {
            System.out.println(("Kullanici adi yanlis"));
        }
        else {
            System.out.println("Giris basarili");


        }






        }

    }




