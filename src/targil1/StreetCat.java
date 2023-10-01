package targil1;

public class StreetCat extends Cat{
    private int numOfFights;

    public StreetCat(){
        super();
    }

    public StreetCat(int numOfFights) {
        this.numOfFights = numOfFights;
    }

    public StreetCat(String name, int lengthMustache, String color, int numOfFights) {
        super(name, lengthMustache, color);
        this.numOfFights = numOfFights;
    }

    @Override
    public String toString() {
        return "StreetCat{" + super.toString() + ", numOfFights=" + numOfFights + "}";
    }
}
