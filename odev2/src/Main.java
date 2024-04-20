public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(0,0);
        Point p3 = new Point(15,3);
        System.out.println(p2.distanceFromPoint(p1));
        System.out.println(p1.toString());

        System.out.println("---------------------------------------");

        Line line = new Line(p1,p2);
        System.out.println(line.lenght());
        System.out.println(line);

        System.out.println("---------------------------------------");

        PolyLine poly1 = new PolyLine();
        poly1.addLine(line);
        poly1.addPoint(p3);
        System.out.println(poly1.length());
        System.out.println(poly1);

        poly1.reverse();

        System.out.println(poly1);

    }
}