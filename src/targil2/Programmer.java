public class Programmer extends Employee{

    public Programmer() {
        super();
    }

    public Programmer(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double calcBonus() {
        return this.getSalary() * 1.5;
    }

    @Override
    public String toString() {
        return "Programmer: " + super.toString();
    }
}
