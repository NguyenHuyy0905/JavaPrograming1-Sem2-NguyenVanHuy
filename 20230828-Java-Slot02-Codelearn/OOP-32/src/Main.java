class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    private int salary;
    public Student(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }
    public int getSalary() {
        return this.salary;
    }
    @Override
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Salary: " + this.getSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Trung", "Male", 1700);
        s.display();
    }
}