public abstract class Shape implements Comparable<Shape> {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();

    public abstract void draw();

    @Override
    public int compareTo(Shape other) {
        int areaComparison = Double.compare(this.calculateArea(), other.calculateArea());
        if (areaComparison != 0) {
            return areaComparison;
        }
        int xComparison = Double.compare(this.x, other.x);
        if (xComparison != 0) {
            return xComparison;
        }
        return Double.compare(this.y, other.y);
    }
}