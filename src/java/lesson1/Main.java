import competitors.*;
import obstacles.*;
import utils.Competition;

public class Main {
    public static void main(String[] args) {

        Competitor entities[] = {new Man(50, 50), new Cat(20, 20)};
        Obstacle obctacles[] = {new Wall(30), new RunningTrack(60), new Wall(100)};

        Competition.compete(entities, obctacles);


    }
}