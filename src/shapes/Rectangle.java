package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        //obj property //method prop...
        this.length = length; //you use this because of name place conflict in the parameter.
        //to make it understand the difference, you must have this.
        //if you rename the parameter you dont have to use this, but it's better
//        to use "this"
    }

    @Override
    public void setWidth(double width) {

    }

//    protected int length;
//    protected int width;
//
//    public Rectangle(){
//
//    }
//
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//
//    }
//
//    public int getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//
//    }





}
//constructor
// https://java.codeup.com/java-ii/object-oriented-programming/#constructors
