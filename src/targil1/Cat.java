package targil1;

public abstract class Cat {
    private String name;
    private int lengthMustache;
    private String color;

    public Cat() {

    }

    public Cat(String name, int lengthMustache, String color) {
        this.name = name;
        this.lengthMustache = lengthMustache;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengthMustache() {
        return lengthMustache;
    }

    public void setLengthMustache(int lengthMustache) {
        this.lengthMustache = lengthMustache;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", lengthMustache=" + lengthMustache +
                ", color=" + color;
    }
}
