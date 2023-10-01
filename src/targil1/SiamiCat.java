package targil1;

public class SiamiCat extends Cat{
    private String favFood;

    public SiamiCat() {
        super();
    }

    public SiamiCat(String favFood) {
        this.favFood = favFood;
    }

    public SiamiCat(String name, int lengthMustache, String color, String favFood) {
        super(name, lengthMustache, color);
        this.favFood = favFood;
    }

    @Override
    public String toString() {
        return "SiamiCat{" + super.toString() + ", favFood=" + favFood + "}";

    }
}
