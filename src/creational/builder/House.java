package creational.builder;

public class House {
    private int walls;
    private int door;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    public House(int walls, int door, boolean hasPool, boolean hasRoof, String color) {
        this.walls = walls;
        this.door = door;
        this.hasPool = hasPool;
        this.hasRoof = hasRoof;
        this.color = color;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoor() {
        return door;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", door=" + door +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }
}
