public class BirdShelter {

    //takes in an array... of birds.
    public void shelterSounds(Bird[] birdsOfTheShelter){

        for (int i = 0; i < birdsOfTheShelter.length; i++) {
            birdsOfTheShelter[i].makeNoise();
        }
    }

}
