public class Point {
    private int x;
    private int y;

   public Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return ("x=" + this.getX() + " y=" + this.getY());
    }

    public double distanceFromPoint(Point obj){
        return Math.sqrt(((this.getX() - obj.getX()) * (this.getX() - obj.getX())) + ((this.getY() - obj.getY()) * (this.getY() - obj.getY())));
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
