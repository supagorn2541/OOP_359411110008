package Lab3;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        //while : ใช้ในกรณีที่ไม่ทราบจำนวนคั้งหรือรอบที่แน่นอน ให้โปรแกรมทำซั้าไปเรื่อยๆจนกว่าจะเจอเงื่อนไขที่เป็นเท็จ
        Scanner sc=new Scanner(System.in);
        int x =1;

        while (x!=0){
            System.out.print("Enter integer");
            x= sc.nextInt();
        }
            System.out.println("Good bye");


    }//main
}//class
