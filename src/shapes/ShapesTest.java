package shapes;

public class ShapesTest {
//    create instances of both Square and Rectangle and assign
//    them to myShape so you can display the shape's area and perimeter.
public static void main(String[] args) {
    Measurable myShape;
    myShape = new Square(5);
    System.out.println(myShape.getPerimeter());
    System.out.println(myShape.getArea());

}





////    public static void main(String[] args) {
////
////        Rectangle box1 = new Rectangle(2,4);
////        System.out.println(box1.getPerimeter());
////        System.out.println(box1.getArea());
//    }
}
