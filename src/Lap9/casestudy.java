package Lap9;

public class casestudy {
    private int Mobileid;
    private String ยี่ห้อ;
    private String รุ่น;
    private double ราคา;
    private String ระบบปฏิบัติการ;
    //constructor


    public casestudy(int mobileid, String ยี่ห้อ, String รุ่น, double ราคา, String ระบบปฏิบัติการ) {
        Mobileid = mobileid;
        this.ยี่ห้อ = ยี่ห้อ;
        this.รุ่น = รุ่น;
        this.ราคา = ราคา;
        this.ระบบปฏิบัติการ = ระบบปฏิบัติการ;
    }
    //getter and setter

    public int getMobileid() {
        return Mobileid;
    }

    public void setMobileid(int mobileid) {
        Mobileid = mobileid;
    }

    public String getยี่ห้อ() {
        return ยี่ห้อ;
    }

    public void setยี่ห้อ(String ยี่ห้อ) {
        this.ยี่ห้อ = ยี่ห้อ;
    }

    public String getรุ่น() {
        return รุ่น;
    }

    public void setรุ่น(String รุ่น) {
        this.รุ่น = รุ่น;
    }

    public double getราคา() {
        return ราคา;
    }

    public void setราคา(double ราคา) {
        this.ราคา = ราคา;
    }

    public String getระบบปฏิบัติการ() {
        return ระบบปฏิบัติการ;
    }

    public void setระบบปฏิบัติการ(String ระบบปฏิบัติการ) {
        this.ระบบปฏิบัติการ = ระบบปฏิบัติการ;
    }
    //toString
    @Override
    public String toString() {
        return "casestudy{" +
                "Mobileid=" + Mobileid +
                ", ยี่ห้อ='" + ยี่ห้อ + '\'' +
                ", รุ่น='" + รุ่น + '\'' +
                ", ราคา=" + ราคา +
                ", ระบบปฏิบัติการ='" + ระบบปฏิบัติการ + '\'' +
                '}';
    }
}
