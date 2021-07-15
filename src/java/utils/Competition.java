package utils;

import entities.Entity;
import obstacles.*;

public class Competition {

    public static void compete(Entity[] entities, Obstacle[] obctacles) {
        for (Entity entity : entities) {
            for (Obstacle obctacle : obctacles) {
                if (!entity.isCompetitine()) {
                    System.out.println(entity + "выбыл");
                    break;
                }
                if (obctacle instanceof Wall) {
                    entity.jumn((Wall) obctacle);
                } else {
                    entity.run((RunningTrack) obctacle);
                }
            }
        }
    }
}