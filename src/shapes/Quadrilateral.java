package shapes;

public abstract class Quadrilateral extends Shapes implements Measurable{

    protected double width;
    protected double length;

    public Quadrilateral(){}

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }


}
