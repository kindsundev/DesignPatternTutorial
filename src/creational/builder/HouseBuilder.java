package creational.builder;

public class HouseBuilder implements Builder{
    private int walls;
    private int door;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    @Override
    public Builder buildRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }

    @Override
    public Builder buildPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    @Override
    public Builder buildWalls(int walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public Builder buildDoor(int door) {
        this.door = door;
        return this;
    }

    @Override
    public Builder buildColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public House build() {
        return new House(walls, door, hasPool, hasRoof, color);
    }
}
