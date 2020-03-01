package Lap9;


import java.sql.*;
import java.util.ArrayList;

public class TestJDBC {
        public static void main(String[] args) {

            //step 1 : load driver
            try {
                Class.forName("org.sqlite.JDBC");
                System.out.println("Driver load successfully.");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            //step 2 : create connection
            String SQCON ="jdbc:sqlite:RUTS.sqlite";
            try {
                Connection conn= DriverManager.getConnection(SQCON);
                if (conn==null) {
                    System.out.println("Could not connect to database.");
                }else {
                    System.out.println("Connected to database.");
                }
                    //step 3 ceate Statements
                    Statement stmt = conn.createStatement();
                    String sql = "select*from sutudent";
                    ResultSet rs = stmt.executeQuery(sql);
                    if (rs == null) {
                        System.out.println("Could not finf any data.");
                    } else {
                        System.out.println("Student data from database:");
                        ArrayList<student> std = new ArrayList<student>();
                        while (rs.next()) {
//                            System.out.println("#############");
//                            System.out.println("SID:"+rs.getInt(1));
//                            System.out.println("SID"+rs.getString(2));
//                            System.out.println("Name"+rs.getString(3));
//                            System.out.println("GPA"+rs.getDouble(4));
                            student s = new student(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getDouble(4));
                            //store object into ArrayList
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

    private static void DisplayObject(ArrayList<student> std) {
            for (student s:std){
                System.out.println(s.toString());
            }
    }
}//class
