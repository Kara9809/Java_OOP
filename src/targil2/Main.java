package targil2;

public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Karina", 123, 200_000);
        Secretary s1 = new Secretary("Marina", 231, 20_000, 30);

        System.out.println(p1);
        System.out.println(s1);

        p1.updateSalary(p1.calcBonus());
        s1.updateSalary(s1.calcBonus());

        System.out.println(p1);
        System.out.println(s1);

    }
}