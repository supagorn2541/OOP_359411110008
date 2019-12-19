package Lab3;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        //for
        //รับค่าจำนวนเต็มจำนวน 5 ครั้ง แล้วหาผลรวมและค่าเฉลี่ย แสดงทางจอภาพ
        Scanner sc=new Scanner(System.in);
        int total=0;
        for (int i = 0; i <5 ; i++) {
            System.out.print("enter an integer");
            total +=sc.nextInt();//total=total+sc.nextInt()

        }
        //display output
            System.out.println("The total valus is:"+total);
            System.out.println("The averge value is:"+(total/5));

    }
}
