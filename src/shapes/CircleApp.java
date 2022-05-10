package shapes;
import util.Input;
import shapes.Circle;

public class CircleApp {

    public static void main(String[] args) {
        Input prompt = new Input();
        System.out.println("What is the radius?");
        int test = prompt.getInt();
        Circle ans = new Circle(test);
        int ans2 = ans.getCircumference();
        System.out.printf("with a radius of %d your circumference would be %d", test, ans2);
    }
}
