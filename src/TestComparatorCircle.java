import shape.Circle;
import shape.ComparatorCircle;

import java.util.*;

public class TestComparatorCircle {
    public static void main(String[] args) {
//        Circle[]circles=new Circle[3];
//        circles[0]=new Circle(5);
//        circles[1]=new Circle();
//        circles[2]=new Circle("Blue",false,3);
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle());
        circles.add(new Circle("Blue",false,3));

        System.out.println("Trước khi sắp xếp:");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        //ComparatorCircle comparatorCircle =new ComparatorCircle();
        circles.sort((Circle c1, Circle c2)-> (int) (c1.getRadius() - c2.getRadius()));

        System.out.println("Sau khi sắp xếp:");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
