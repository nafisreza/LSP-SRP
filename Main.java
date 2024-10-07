import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(ShapeFactory.createShape("square", 0, 0, 5));
        shapes.add(ShapeFactory.createShape("rectangle", 1, 1, 4, 6));
        shapes.add(ShapeFactory.createShape("circle", 2, 2, 3));
        shapes.add(ShapeFactory.createShape("square", 3, 3, 4));


    }
}