public class Line {
    private Point obj1;
    private Point obj2;

    public Line(Point obj1 , Point obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public String toString(){
        return ("x=" + getObj1().getX() + " y=" + getObj1().getY() + "x=" + getObj2().getX() + " y=" + getObj2().getY());
    }
    public double lenght(){
        return this.getObj1().distanceFromPoint(this.getObj2());
    }

    public Point getObj1() {
        return obj1;
    }

    public Point getObj2() {
        return obj2;
    }
}
