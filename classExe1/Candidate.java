package classExe1;

import java.util.ArrayList;

public class Candidate extends Person {
    private double gpa;
    private String major;
    private ArrayList<Course> courses;

    @Override
    public String toString() {
        return "Candidate{" +
                "gpa=" + gpa +
                ", major='" + major + '\'' +
                ", courses=" + courses +
                '}';
    }

    public Candidate(int id, String name, String contact, double gpa, String major, ArrayList<Course> courses) {
        super(id, name, contact);
        this.gpa = gpa;
        this.major = major;
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public double getGpa() {
        return this.gpa;
    }

    public String getMajor() {
        return this.major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
