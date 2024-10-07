public class Square extends Shape {
    private double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square at (" + x + ", " + y + ") with side " + side);
    }
}
