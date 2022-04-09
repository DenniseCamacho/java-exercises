import java.util.List;
import java.io.*;

public class DishesManager {
    String words;
    String filename;

//files.write;

public DishesManager() {
    try {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("data/Dishes.txt")
        );
        bw.write("Joy\n");
        bw.write("Kindness\n");
        bw.write("Peace\n");
        bw.close();
    } catch (Exception anyvar) {
        System.out.println(anyvar);
    }
}


}
