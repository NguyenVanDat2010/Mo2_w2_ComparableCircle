package shape;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){}
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(String color, boolean filled, double radius){
        super(color, filled, radius);
    }

    //compareTo so sánh đối tượng hiện tại với đối tượng được chỉ định.
    @Override
    public int compareTo(ComparableCircle comparableCircle){
        if (getRadius()>comparableCircle.getRadius()){
            return 1;
        }else if (getRadius()<comparableCircle.getRadius()){
            return -1;
        }
        return 1;
    }
}
