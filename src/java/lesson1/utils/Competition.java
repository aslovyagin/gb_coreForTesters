package utils;

import competitors.Competitor;
import obstacles.*;

public class Competition {

    public static void compete(Competitor[] entities, Obstacle[] obctacles) {
        for (Competitor entity : entities) {
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