package Lab3;
import java.util.Scanner;
public class Control3 {
    public static void main(String[] args) {
        //if-else-if : ทดสอบหลายเงื่อนไข ทำงานอย่างใดอย่างหนึ่งที่ผลการทดสอบเป็นจริง
        //โครงสร้าง if-else-if
//        if (เงื่อนไข 1)}
//            คำสั่งเมื่อเงื่อนไขที่ 1เป็นจริง;
//        }else if (เงื่อนไข 2){
//            คำสีั่งเมื่อเงื่อนไขที่ 2เป็นจริง;
//        }else if (เงื่อนไขที่ 3){
//            คำสั่งเมื่อเงื่อนไขที่ 3เป็นจริง;
//        }else if (เงื่อนไขที่ n){
//            คำสั่งเมื่อเงื่อนไข nเป็นจริง;
//        }else{
//            คำสั่งที่ทำงานเมื่อทุกเงื่อนไขเป็นเท็จทั้งหมด;
//        }
        //How old are? >50 ==old, >20 ==teenager, <20 == young

        Scanner sc=new Scanner(System.in);
        System.out.print("How old are?:");
        int age =sc.nextInt();
        //test condition
        if (age>50) {
            System.out.println("You are old.");
        }else if (age>20) {
            System.out.println("You are teenager.");
        }else {
            System.out.println("You are young.");
        }





    }
}




