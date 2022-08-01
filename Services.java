import java.util.Scanner;
import java.sql.*;
public class Services {
	public static void main(String[] args) throws SQLException {
	String m="y";
	String s = "y";
	outer: while (m.equals("y")) {
		
		System.out.println("Press 1 for Admin");
		System.out.println("Press 2 for Signup");
		System.out.println("Press 3 for Login");
		
		Scanner r = new Scanner(System.in);
		int p = r.nextInt();
		
		book b=new book();
		switch(p) {
		
		case 1:
			b.Admin();
			break;
		case 2:
			
			b.Sign_up();
			break;
		case 3:
			b.Log_in();
			break;
			
		default:
			System.out.println("Wrong Choice");
		}

		   {
    			System.out.println("Customer Details");
    			book bb=new book();
    			bb.SuperMarket();
    			
    		}
    		
    		{
    		while (s.equals("y")) {
    		System.out.println("SERVICES PROVIDED BY US");
    		System.out.println("press 1 to choose PersonalCare");
    		System.out.println("press 2 to choose Vegetable");
    		System.out.println("press 3 to choose DairyProducts");
    		System.out.println("press 4 to choose Snacks");
    		System.out.println("press 6 to choose EXIT");

    		Scanner n = new Scanner(System.in);
    		int i = n.nextInt();

    		book bb = new book();

    		switch (i) {
    		case 1:
    			bb.PersonalCare();
    		    break;
    		case 2: 
    			bb.Vegetable();
    		    break;
    		case 3: 
    			bb.DairyProducts();
    		    break;
    		case 4: 
    			bb.Snacks();
    		    break;
    		case 5:
    			System.exit(0);
    		default : 
    			System.out.println("Wrong Choice");
    			
    		    break;
    	}
    		
    		System.out.println("Do you want to continue then press y/n");
    		s = n.next();
    		if (s.equals("n"))
    		{
    		    
    			System.out.println("******Session closed*******");

    		    break outer ;
    		}
    		}
    	}
    		
    		
       }
      }
        	 
     }
		     
	
	
  
