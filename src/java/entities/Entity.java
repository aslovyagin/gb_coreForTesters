package entities;

import interfaces.Jumpable;
import interfaces.Runnable;
import obstacles.*;

abstract public class Entity implements Jumpable, Runnable {
    int maxDistance;
    int maxHeigh;
    boolean isCompetitine = true;

    public Entity(int maxDistance, int maxHeigh) {
        this.maxDistance = maxDistance;
        this.maxHeigh = maxHeigh;
    }

    public boolean isCompetitine() {
        return isCompetitine;
    }

    public void setCompetitine(boolean competitine) {
        isCompetitine = competitine;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxHeigh() {
        return maxHeigh;
    }

    public void setMaxHeigh(int maxHeigh) {
        this.maxHeigh = maxHeigh;
    }

    public void jumn(Wall wall) {
        System.out.println("Я начал прыгать, максимальная высота " + maxHeigh);
        if (maxHeigh >= wall.getLimit()) {
            System.out.println("Перепрыгнул");
        } else {
            System.out.println("Не перепрыгнул");
            isCompetitine = false;
        }
    }

    public void run(RunningTrack track) {
        System.out.println("Я начал бежать, максимальная дистанция " + maxDistance);
        if (maxHeigh >= track.getLimit()) {
            System.out.println("Дистанция пройдена");
        } else {
            System.out.println("Дистанция не пройдена");
            isCompetitine = false;
        }
    }
}