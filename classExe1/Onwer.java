package classExe1;

import java.util.Arrays;

public class Onwer extends Worker {
    private String[] staff;

    public Onwer(int id, String name, String contact, String role,double salary,String[] staff) {
        super(id, name, contact, role, salary);
        this.staff = staff;
    }

    public String[] getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        return "Onwer{" +
                "staff=" + Arrays.toString(staff) +
                '}';
    }

    public void setStaff(String[] staff) {
        this.staff = staff;
    }
}
