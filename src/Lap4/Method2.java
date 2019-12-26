package Lap4;
//เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 ค่า
//จากนั้นแสดงผล บวล ลบ คูณ หาร โดยการใช้ method

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an number 1:");
        double x=sc.nextDouble();
        System.out.print("Enter an number 2:");
        double y=sc.nextDouble();

        double z=plus(x,y);
        System.out.println(x+"+"+y+"="+z);
        
        double a=minus(x,y);
        System.out.println(x+"-"+y+"="+a);

        double b=multiple(x,y);
        System.out.println(x+"*"+y+"="+b);

        double c=devide(x,y);
        System.out.println(x+"/"+y+"="+c);
        
    }

    private static double devide(double x, double y) {
        return x / y;
    }

    private static double multiple(double x, double y) {
        return x * y;
    }

    private static double minus(double x, double y) {
        return x-y;
    }

    private static double plus(double x, double y) {
        return x + y;
    }
   


}
