import java.util.Collections;
import java.util.List;

public class OrderPrinter {
    public static void printShapesInOrder(List<Shape> shapes) {
        Collections.sort(shapes);
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println();
        }
    }
}