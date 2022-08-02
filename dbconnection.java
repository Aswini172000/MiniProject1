package mydate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class dbconnection  {
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
	public void  user()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  train_ticket(name,address,Booking_date)values(?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user Booking date:");
        String soc=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        int a=stmt.executeUpdate();
        System.out.println("***slot booked***");
        System.out.println("!!!Thank you!!!");
        System.out.println("***Have a nice Journey***");
        
	}
	
	
	public void train_ticket()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  train_ticket(name,address,Booking_date)values(?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        int a=stmt.executeUpdate();
        System.out.println("***slot booked***");
        System.out.println("!!!Thank you!!!");
        System.out.println("***Have a nice Journey***");
	}
	public void  flight_ticket()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  train_ticket(name,address,Booking_date)values(?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        int a=stmt.executeUpdate();
        System.out.println("***slot booked***");
        System.out.println("!!!Thank you!!!");
        System.out.println("***Have a nice Journey***");
	}
	public void  bus_ticket()throws SQLException {
        System.out.println("***please enter user details***");
        Connection conn=getconn();
        String s1="insert into  train_ticket(name,address,Booking_date)values(?,?,?)";
        PreparedStatement stmt=conn.prepareStatement(s1);
        System.out.println("Enter user name:");
        String name=sc1.nextLine();
        System.out.println("Enter user address:");
        String address=sc1.nextLine();
        System.out.println("Enter user bdate:");
        String soc=sc1.nextLine();
        stmt.setString(1,name);
        stmt.setString(2,address);
        stmt.setString(3,soc);
        int a=stmt.executeUpdate();
        System.out.println("***slot booked***");
        System.out.println("!!!Thank you!!!");
        System.out.println("***Have a nice Journey***");
	}
	

}
