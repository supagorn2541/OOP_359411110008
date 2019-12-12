package Lab2;

import java.util.Scanner;

public class Basicjava2 {

    public static void main(String[] args) {
        //input data from keyboard

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is" + name);
        System.out.print("Enter your Email:");
        String email=sc.nextLine();
        System.out.println("your email is"+email);
        System.out.print("Enter your tel");
        String tel=sc.nextLine();
        System.out.println("your tel is"+tel);




    }//main
}
