package targil2;

public class Secretary extends Employee{
    private int countWordsPerMinutes;

    public Secretary() {
        super();
    }

    public Secretary(String name, int id, double salary, int countWordsPerMinutes) {
        super(name, id, salary);
        this.countWordsPerMinutes = countWordsPerMinutes;
    }

    public double calcBonus() {
        return this.getSalary() +500;
    }

    @Override
    public String toString() {
        return "targil2.Secretary: " + super.toString() + " ,countWordsPerMinutes=" + countWordsPerMinutes;
    }
}
