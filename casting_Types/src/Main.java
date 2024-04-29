public class Main {
    public static void main(String[] args) {
        /*int a = 5;
        int b = a++;
        System.out.println(b);
        int c = ++a;
        System.out.println(c);
        int d = a++ + b-- + c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);  */
        int i = 2;
        boolean bool = (i < 3) || (++i <3);
        System.out.println("bool = " +bool + " i =" + i);
        //eger or baglaci bastan true ise devamına bakmaz bile

        boolean bool2 = (i > 3) || (++i < 3);
        System.out.println("bool = " +bool2 + " i =" + i);

        int i2 = 2;
        boolean bool3 = (i2 < 5) || ( i2 < 3 ) && (++i2 < 3);
        System.out.println("bool = " + bool3  + " i = "+ i2);

        int i3 = 2;
        boolean bool4 = (i3> 5) && ( i3 > 3 ) || (i3++ < 3);
        System.out.println("bool = " + bool4  + " i = "+ i3);

        int i4 = 2;
        boolean bool5 = (i++ < 3 ) && false;
        System.out.println("bool = " + bool5 + " i = " + i4);

    }
}