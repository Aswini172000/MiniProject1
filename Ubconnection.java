package mydate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ubconnection {
	public Connection getconn()
    {
         Connection conn=null;
         try {
             String url="jdbc:mysql://localhost:3306/prodapt";
             String username="root";
             String pass="root";
             conn=DriverManager.getConnection(url,username,pass);
         }catch(Exception e) {
             e.printStackTrace();
                          
         }
         return conn;
    }
	Scanner sc1=new Scanner(System.in);
	public void train_ticket()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        System.out.println("Enter the username:");
        String name=sc1.nextLine();
        String s1="UPDATE train_ticket SET address=? ,Booking_date=? WHERE name=?;";
        PreparedStatement stmt=conn.prepareStatement(s1);
       // System.out.println("Enter user name:");
       // String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        stmt.setString(1,address);
        stmt.setString(2,soc);
        stmt.setString(3,name);
        int a=stmt.executeUpdate();
        System.out.println("***Table is Updated***");
        
	}
	public void bus_ticket()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String name=sc1.nextLine();
        String s1="UPDATE bus_ticket SET address=? ,Booking_date=? WHERE name=?;";
        PreparedStatement stmt=conn.prepareStatement(s1);
       // System.out.println("Enter user name:");
       // String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
      //  stmt.setString(1,name);
        stmt.setString(1,address);
        stmt.setString(2,soc);
        stmt.setString(3,name);
       int a=stmt.executeUpdate();
        System.out.println("***Table is Updated***");
        
	}
	public void flight_ticket()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String name=sc1.nextLine();
        String s1="UPDATE flight_ticket SET address=? ,Booking_date=? WHERE name=?;";
        PreparedStatement stmt=conn.prepareStatement(s1);
       System.out.println("Enter user name:");
       //String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        stmt.setString(1,address);
        stmt.setString(2,soc);
        stmt.setString(3,name);
       
      int a=stmt.executeUpdate();
        System.out.println("***Table is Updated***");
        
	}
        
}
