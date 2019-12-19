package Lab3;

import java.util.Scanner;

public class excercise_lap3 {
    public static void main(String[] args) {
        //เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 จำนวน จากนั้นทดสอบว่าจำนวนใดมีค่ามากกว่ากัน
        //แสดงผลลัพธ์ทางหน้าจอภาพ
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a real number x:");
        double x =sc.nextDouble();
        System.out.print("Enter a real number y:");
        double y =sc.nextDouble();

        //test condition
        if (x>y)
            System.out.println(x+" more than "+y);
        else
            System.out.println(y+" more than"+x);

    }

}


