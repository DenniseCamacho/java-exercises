public class MiniCooper extends Vehicle{
    //MiniCooper inherits from vehicle,
    //its a child of vehicle.
    public void makeNoise(){
        super.makeNoise(); // goes into the super class (vehicle) and adds it.
        System.out.println("Vrrrrooooommmmm");
    }
}
