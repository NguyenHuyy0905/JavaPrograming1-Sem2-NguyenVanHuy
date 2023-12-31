class Employee extends Person {
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + this.getName());
        System.out.println("Employee address: " + this.getAddress());
        System.out.println("Employee salary: " + salary);
    }
}