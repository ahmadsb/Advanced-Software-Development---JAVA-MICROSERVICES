package classExe1;

public class Worker extends Person {
    private String role;
    private double salary;

    public Worker(int id, String name, String contact, String role, double salary) {
        super(id, name, contact);
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
