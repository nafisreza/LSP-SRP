public class ShapeFactory {
    public static Shape createShape(String type, double x, double y, double... params) {
        switch (type) {
            case "square":
                return new Square(x, y, params[0]);
            case "rectangle":
                return new Rectangle(x, y, params[0], params[1]);
            case "circle":
                return new Circle(x, y, params[0]);
            default:
                System.out.println("Invalid Shape");
        }
        return null;
    }
}
