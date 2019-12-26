package Lap4;

public class Method1 {
    public static void main(String[] args) {
        System.out.println("Hello from Main method.");
        //calling method
        A();
        B("Joe");
        //calling c() method
        //1.ประกาศตัวแปรชนิดเดียวกันกับค่าที่ส่งมาจากเมธอดเพื่อเก็บค่าข้อมูลนั้นไว้
        String Myname=C("Supagorn","Tongduk");
        System.out.println(Myname);
        //2.กรณีที่ไม่ต้องการเก็บค่าที่ส่งมาจากเมธอด สามารถแสดงค่าข้อมูลนั้นด้วยคำสั่ง print()หรือ printlin()ได้เลย
        System.out.println(C("Supagorn","Tongduk"));
    }

    //Method type 1:no parameter, no retrun value
    public static void A(){
        System.out.println("Hello from A method.");
    }
    //Method type2: 1 or more parameters, no retrun value
    public static  void B(String msg){//msg เป็น local variable หรือ ตัวแปรเฉพาะที่
        System.out.println("Hello from B method."+msg);
    }
    //Method type 3: 1 or more parameters, retrun 1 value
    public static String C(String fName,String LName){
        System.out.println("Hello from C method.");
        String Myname=fName+" "+ LName;

        return Myname;

    }
}
