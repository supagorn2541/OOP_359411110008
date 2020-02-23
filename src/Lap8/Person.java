package Lap8;

public class Person {
    //Attributes
    private String pid;
    private String name;
    private String dateOfBirth;
    //Constructor


    public Person(String pid, String name, String dateOfBirth) {
        this.pid = pid;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    // getter and setter

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void running(){
        System.out.println("I am running");
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

