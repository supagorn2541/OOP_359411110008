package Lap7;

public class Dog {
    //Attributes คือ คุณลักษณะของ Object
    private String name;
    private int age;
    private String hairColor;

    //Constructor คือ เมธอดที่มีชื่อเดียวกันกับคลาส เมื่อมีการสร้าง Object จะมีการเรียกใช้ Constructor เสมอ
    //1. Defalt Constructor
    public Dog() {
    }

    //2. Design Constructor
    public Dog(String name, int age, String hairColer) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColer;
    }

    //Behaviors คือ พฤติกรรมของ Object ซึ่งนิยามด้วยเมธอดที่อยู่ภายในลาส
    public void sleeping() {
        System.out.println("Dog Sleeping");
    }

    public void Eating() {
        System.out.println("Dog Eating");
    }

    public void Running() {
        System.out.println("Dog Running");
    }

    //getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter ใช้อ่านข้อมูลของ Object
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //setter ใช้ปรับปรุงข้อมูลของ Object
    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColer) {
        this.hairColor = hairColor;
    }



    @Override
    public String toString() {
        return "[Name:"+this.name+
                "Age:"+this.age+
                "Color:"+this.hairColor+"]\n";

    }

        }







