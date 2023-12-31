class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + (this.getSalary() + this.getBonus()));
    }
}