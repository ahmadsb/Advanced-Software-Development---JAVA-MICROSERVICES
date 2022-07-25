package classExe1;

public class Employee extends Worker{
    private String department;
    private String manager;

    public Employee(int id, String name, String contact, String role, String department, String manager,double salary) {
        super(id, name, contact, role, salary);
        this.department = department;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", manager='" + manager +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }



}
