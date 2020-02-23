package Lap7;

public class MobileStore {
    public static void main(String[] args) {

        Mobile mobile1 = new Mobile("1001", "Wiko", "Sunny 4 plus", 2090.00, "Android9go");
        System.out.println(mobile1.getId());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getModel());
        System.out.println(mobile1.getPrice());
        System.out.println(mobile1.getOs());

        //change price
        mobile1.setPrice(1500.00);
        System.out.println(mobile1.toString());
    }
}
