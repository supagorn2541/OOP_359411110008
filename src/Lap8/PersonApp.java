package Lap8;

public class PersonApp {
    public static void main(String[] args) {
        //create objects
        Person P1= new Person
                ("1809900843542","supagorn tongduk","29/01/1998");
        System.out.println(P1.toString());

        Student S1= new Student
                ("1800800293631","tongrat","05/06/1997","std001","Information System");
        System.out.println(S1.toString());

        S1.running();
        S1.addsubject();
        //P1.addSubject();
        // object ของ supper-class ไม่สามารถเรียกใช้ method ของ sub-class ได้

    }
}
