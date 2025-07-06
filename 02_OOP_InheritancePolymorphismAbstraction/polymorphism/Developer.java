public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }

    public void debug() {
        System.out.println(name + " is debugging the system.");
    }
}
