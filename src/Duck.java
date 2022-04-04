public class Duck extends Bird{
    //everything in Bird extends to duck.
    //everything in the bird class is accessible to the Duck class
    //because of extends.
    public void makeNoise(){
        System.out.println("Quack quack");
    }
}
