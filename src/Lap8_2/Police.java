package Lap8_2;

public class Police extends person {

    private String workcontry;

    //constructor

    public Police(String name, String bornYear, String workcontry) {
        super(name, bornYear);
        this.workcontry = workcontry;
    }

    //introduce
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm police,I working at"+this.workcontry+"contry.");
    }
    //getter and setter

    public String getWorkState() {
        return workcontry;
    }

    public void setWorkState(String workState) {
        this.workcontry = workState;
    }
}
