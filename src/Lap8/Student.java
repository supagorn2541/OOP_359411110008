package Lap8;

public class Student extends Person{
    private String sid;
    private String program;

    public Student(String pid, String name, String dateOfBirth, String sid, String program) {
        super(pid, name, dateOfBirth); //เรียกใช้ constructor ของ Super-class
        this.sid = sid;
        this.program = program;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    //toString
    public void addsubject(){
        System.out.println("I'm adding subject.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }
}
