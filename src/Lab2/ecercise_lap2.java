package Lab2;

import java.util.Scanner;

public class ecercise_lap2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your weight:");
        double w=sc.nextDouble();
        System.out.print("Enter your hight(meter):");
        double h=sc.nextDouble();
        
        double bmi=w/(h*h);

        System.out.println("Your BMI:"+bmi);

    }
}
