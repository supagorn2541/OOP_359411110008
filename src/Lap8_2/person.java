package Lap8_2;

public class person {
    //attributes
    private String name;
    private String bornYear;
    //constructor

    public person(String name, String bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }
    //introduce
    public void introduce(){
        System.out.println("My name is"+this.name);
        System.out.println("I was born in"+this.bornYear);
    }
    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornYear() {
        return bornYear;
    }

    public void setBornYear(String bornYear) {
        this.bornYear = bornYear;
    }
}
