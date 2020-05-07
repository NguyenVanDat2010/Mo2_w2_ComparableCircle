import shape.ComparableCircle;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[]circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle("Yellow",false,3.5);

        System.out.println("Trước khi sắp xếp: ");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("Sau khi sắp xếp: ");
        for (ComparableCircle circle:circles){
            System.out.println(circle);
        }
    }
}
