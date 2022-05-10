import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Input sc = new Input();
        System.out.printf("What would you like to do?%n" +
                " 0 - exit%n" +
                " 1 - view all movies%n" +
                " 2 - view movies in the animated category%n" +
                " 3 - view movies in the drama category%n" +
                " 4 - view movies in the horror category%n" +
                " 5 - view movies in the scifi category%n");
        int usersResp = sc.getInt(0, 5);
        System.out.println(usersResp);

    }
}
