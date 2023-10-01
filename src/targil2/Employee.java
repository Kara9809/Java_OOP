public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {

    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double calcBonus() {
        return 0;
    }


    public void updateSalary(double updateSalary) {
        this.salary = updateSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return
                "name='" + name +
                ", id=" + id +
                ", salary=" + salary;
    }
}
