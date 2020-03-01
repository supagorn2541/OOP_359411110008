package Lap9;

public class student {
    //attributes
    private int sid;
    private String name;
    private String major;
    private double gpa;
    //consturctor


    public student(int sid, String name, String major, double gpa) {
        this.sid = sid;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    //getter and getsid

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //toString
    @Override
    public String toString() {
        return "student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
