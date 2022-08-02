package mydate;
import java.sql.SQLException;
import java.util.*;

public class Ticketbooking {
static void Userinsert() throws SQLException
{
	Scanner sc5=new Scanner(System.in);
	System.out.println("1 for Booking train ticket booking");
	System.out.println("2 for Booking bus ticket booking");
	System.out.println("3 for Booking flight ticket booking");
	int n5=sc5.nextInt();
	dbconnection dd=new dbconnection();
	switch(n5) {
	case 1:{
		System.out.println(" Try to book train ticket");
		dd.train_ticket();
		break;
		
	}
	case 2:{
		System.out.println(" Try to book bus ticket");
		dd.bus_ticket();
		break;
		
		
	}
	case 3:{
		System.out.println(" Try to book flight ticket");
		dd.flight_ticket();
		break;
		
		
	}
	
	}
}
static void insert()  throws SQLException
{
	System.out.println("*****Insert Operations*****");
	Scanner sc2=new Scanner(System.in);
	System.out.println("1 for Booking train ticket booking");
	System.out.println("2 for Booking train bus booking");
	System.out.println("3 for Booking train ticket booking");
	int n2=sc2.nextInt();
	dbconnection dd=new dbconnection();
	switch(n2) {
	case 1:{
		System.out.println(" Try to book train ticket ");
		dd.train_ticket();
		break;
		
	}
	case 2:{
		System.out.println(" Try to book bus ticket");
		dd.bus_ticket();
		break;
		
		
	}
	case 3:{
		System.out.println(" Try to book flight ticket ");
		dd.flight_ticket();
		break;
		
		
	}
	
	}
	
}
static void Update() throws SQLException
{
	System.out.println("update");
	System.out.println("*****Update Operations*****");
	Scanner sc3=new Scanner(System.in);
	System.out.println("1 for Updating  train ticket");
	System.out.println("2 for Updating bus ticket");
	System.out.println("3 for Updating for flight ticket");
	int n3=sc3.nextInt();
	Ubconnection ub=new Ubconnection ();
	switch(n3) {
	case 1:{
		System.out.println("Try to update train tickets");
		ub.train_ticket();
		break;
		
	}
	case 2:{
		System.out.println("Try to update bus tickets");
		ub.bus_ticket();
		break;
		
		
	}
	case 3:{
		System.out.println("Try to update flight tickets");
		ub.flight_ticket();
		break;
	}
	
	}
}

static void adminlogin()throws SQLException{
	Scanner sc1=new Scanner(System.in);
	System.out.println("***************Admin_Login***************");
	System.out.println("Enter the admin name: ");
	String adminname=sc1.nextLine();
	System.out.println("Enter the admin password: ");
	String password=sc1.nextLine();
	if(adminname.equals("Aswini") && password.equals("aswini123")) {
		System.out.println("***Authentication Successfully***");
		System.out.println("Enter your choice");
		System.out.println("1 for Insert Operation");
		System.out.println("2 for Update Operation");
		int n1=sc1.nextInt();
		switch(n1) {
		case 1:{
			insert();
			break;
		}
		case 2:{
			Update();
			break;
		}
		}
	}
		
	
	
}
static void userlogin() throws SQLException{
	System.out.println("user");
	Scanner sc4=new Scanner(System.in);
	System.out.println("***************User_Login***************");
	System.out.println("Enter the username: ");
	String username=sc4.nextLine();
	System.out.println("Enter the password: ");
	String pword=sc4.nextLine();
	if(username.equals("Srija") && pword.equals("srija123")) {
		System.out.println("***Loged In Successfully***");
		Userinsert();
	}
	else {
		System.out.println("New Account is created");
		Userinsert();
	}

	
}
public static void main(String[] args)  throws SQLException {
	Scanner sc=new Scanner(System.in);
	String[] r= {"user","admin"};
    String role="";
    System.out.println("Enter your role:");
    System.out.println("press 1 if you are user");
    System.out.println("press 2 if you are admin");
    int n=sc.nextInt();
    switch(n) {
    case 1:{
    	role=r[0];
    	userlogin();
    	 break;
    }
    case 2:{
    	role=r[1];
    	adminlogin();
    	 break;
    }
    }

	
}
}
