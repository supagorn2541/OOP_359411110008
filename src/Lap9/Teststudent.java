package Lap9;

import java.sql.*;
import java.util.ArrayList;

public class Teststudent {
    public static void main(String[] args) {
        //step1 load driver

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver load successfully.");
            e.printStackTrace();
        }
        //step 2
        String SQCON = "jdbc:sqlite:MobileEX.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCON);
            if (conn == null) {
                System.out.println("Could not connect to database.");
            } else {
                System.out.println("Connected to database.");
            }
            //step 3
            Statement stmt = conn.createStatement();
            String sql = "select * from Mobilex";
            ResultSet rs=stmt.executeQuery(sql);
            if (rs==null) {
                System.out.println("Could not finf any data.");
            }else{
                System.out.println("Mobile data from database");
                ArrayList<casestudy> std=new ArrayList<casestudy>();
                while (rs.next()){
//                    System.out.println("#########");
//                    System.out.println("Mobileid"+rs.getInt(1));
//                    System.out.println("ยี่ห้อ:"+rs.getString(2));
//                    System.out.println("รุ่น:"+rs.getString(3));
//                    System.out.println("ราคา:"+rs.getDouble(4));
//                    System.out.println("ระบบปฏิบัติการ"+rs.getString(5));
                    casestudy s=new casestudy(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDouble(4),
                            rs.getString(5));
                    //store object int ArrayList
                            std.add(s);
                }
                DisplayObject(std);
                //step 5 close all connection
                rs.close();
                stmt.close();
                conn.close();
            }

            } catch (SQLException e) {
            e.printStackTrace();
        }


    }//main

    private static void DisplayObject(ArrayList<casestudy> std) {
        for (casestudy s:std){
            System.out.println(s.toString());
        }
    }

}//class
