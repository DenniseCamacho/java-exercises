package shapes;

public class Square extends Quadrilateral {

    //could do private double length;
                            //^superclass
    //go into super class and call its constructor.
    public Square(double side){
        super(side, side); //the constructor that takes two arguments.
        //pass the side arguments. set length width to both of them
    }
    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
        this.width = width;

    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;

    }


//    public Square(int length, int width) {
//        super(length, width);
//    }
//
//    public Square(int side){
//    super.length = side;
//    super.width = side;
////     super(side, side);
//
//}
//
//public int getPerimeter(){
//        return 4 * super.width;
//}
//
//public int getArea(){
//        return (int) Math.pow(super.length, 2);
//}

}
//constructor
// https://java.codeup.com/java-ii/object-oriented-programming/#constructors
