package shapes;

public class Circle {
    private int area;
    private int circumference;
    private int radius;
    private float length;
    private float width;
    private double pi = Math.PI;
    Circle(){}

    public Circle(double radius) {
        this.radius = (int) radius;
    }

    public double getArea() {
        this.area = (int) (pi * (this.radius^2));
        return area;
    }

    public int getCircumference() {
        this.circumference = (int) (2 * pi * this.radius);
        return circumference;
    }

}
