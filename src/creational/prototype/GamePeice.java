package creational.prototype;

public class GamePeice implements Prototype<GamePeice>{

    private int pos;
    private String color;

    public GamePeice(int pos, String color) {
        this.pos = pos;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public GamePeice clone() {
        return new GamePeice(this.pos, this.color);
    }

    public String toString() {
        return "(pos : " + pos + ", color : " + color + ")";
    }
}
