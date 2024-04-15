import java.util.ArrayList;
import java.util.Collections;

public class PolyLine {
    private ArrayList<Point> points;
    public PolyLine(){
        points = new ArrayList<>();
    }
    public PolyLine(Line obj){
        points = new ArrayList<>();
        addLine(obj);
    }

    public void addPoint(Point obj){
        points.add(obj);
    }

    public void addLine(Line obj){
        points.add(obj.getObj1());
        points.add(obj.getObj2());
    }

    public void addPolyLine(PolyLine obj){
        points.addAll(obj.points);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Point point : points) {
            stringBuilder.append(point.toString()).append(", ");
        }
        if (stringBuilder.length() > 1) {
            stringBuilder.setLength(stringBuilder.length() - 2);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public double length (){
        double totalLength = 0;
        for (int i = 0 ; i < points.size()-1 ; i++){
            totalLength += points.get(i).distanceFromPoint(points.get(i+1));

        }
        return totalLength;
    }

    public void reverse (){
        Collections.reverse(points);
    }
}
