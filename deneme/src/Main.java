import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /* String a = "Good luck";
    String b = "Good";
    b += " luck";
    String c = b;

        System.out.println(b);
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));

     */
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Tofas");
        liste.add("mazda");
        liste.add("bmw");
        liste.add("merco");
        liste.add("doblo");

        for (String araba : liste){
            System.out.println(araba);
        }

        String[] araba = {"tofas" , "merco"};

        for (String model : araba){
            System.out.println(model);
        }


    }
}