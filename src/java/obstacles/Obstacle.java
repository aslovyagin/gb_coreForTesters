package obstacles;

abstract public class Obstacle {

    int limit;

    public Obstacle(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setL(int limit) {
        this.limit = limit;
    }
}