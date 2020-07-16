package Gun37.instanceModifiers.privateModifier.same;

public class Person {
    int id;
    String name;
    String username;
    String password;

    public void SifreBelirle(String sifre) {
        if (sifre.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("en az 8 karakter olmali");
        }
    }

    public void SifreGoster() {
        if (this.password != null) {

                System.out.println("****" + this.password.substring(4));
        }

    }
}
