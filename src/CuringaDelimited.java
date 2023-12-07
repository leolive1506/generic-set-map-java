import java.util.List;

import java.util.ArrayList;
import generics.entities.Circle;
import generics.entities.Rectangle;
import generics.entities.Shape;

public class CuringaDelimited {
      public static void main() {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total areas: " + totalArea(myShapes));
        System.out.println("Total areas: " + totalArea(myCircles));        
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s: list) {
            sum += s.area();
        }

        return sum;
    }
}
