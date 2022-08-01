import java.util.Scanner; 
import java.sql.*;
public class book{
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="root";
	String pass="root";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}
	Scanner sc1 = new Scanner(System.in);
	
	public void Admin() throws SQLException{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("........ WELCOME TO ONLINE SUPERMARKET ADMIN ACCESS............");
		

		System.out.println("Please Enter The Admin Details:");

		System.out.println("Enter Admin name: ");
		String usern = sc1.nextLine();
		System.out.println("Enter Admin password: ");
		String passw = sc1.nextLine();

		if(usern.equals("Sridhar") && passw.equals("sridhar@36"))
		{
		System.out.println("your authentication is succefull");}
	}
	
	
	public void Sign_up() throws SQLException{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("........ WELCOME TO ONLINE SUPERMARKET............");
		System.out.println("Please Enter The Signup Details:");
		
		Connection con=getconn();
		String s1 = "insert into Sign_up(username,password) values(?,?)";
		PreparedStatement stmt = con.prepareStatement(s1);
		System.out.println("Enter user name");
		String user=sc1.next();
		System.out.println("Enter password");
		String password=sc1.next();
		 
		 stmt.setString(1,user);
	     stmt.setString(2, password);
	     int a = stmt.executeUpdate();
		
		System.out.println("Re enter password");
		Scanner sc2=new Scanner(System.in);
		String passw2=sc2.next();
		
		if(password.equals(passw2)) {
			System.out.println("The password is correct");
		}
		else {
			System.out.println("Password is mismatching");
			System.exit(0);
		}
	     System.out.println("Account created");	 
	     Log_in();
	}	
		public void Log_in() throws SQLException {
		System.out.println("Enter login detail");
		Scanner a=new Scanner(System.in);
		System.out.println("Enter user name");
		String user=a.next();

		System.out.println("Enter your password");
		String password=a.next();
		 Connection con = getconn();
		 String s1 = "select * from Sign_up where username ='"+user+"' and password='"+password+"';";
		 PreparedStatement stmt = con.prepareStatement(s1);

		 ResultSet rs = stmt.executeQuery(s1);
         String u="",p="";
         while(rs.next()) {
             u=rs.getString(1);
             p=rs.getString(2);

         }
         
         if(user.equals(u)&&password.equals(p)) {
        	 System.out.println("Your Authentication Is Succefull");
         }	else
         {
        	 
        	 System.out.println("Please Enter Valide Input");
        	 book q=new book();
        	 q.Log_in();
         }
         
}	
	public void SuperMarket() throws SQLException {
			System.out.println("***Please enter Customer details***");
			 Connection con = getconn();
			 String s1 = "insert into SuperMarket(Customer_id,Customer_name,Customer_number,Customer_email) values(?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter Customer_id:");
			             int id =sc1.nextInt();
			             System.out.println("Enter Customer_name:");
			             String username =sc1.next();
			             System.out.println("Enter Customer_number:");
			             String number =sc1.next();
			             System.out.println("Enter Customer_email:");
			             String email = sc1.next();
			            
			       stmt.setInt(1,id);
			       stmt.setString(2,username);
			       stmt.setString(3, number);
			       stmt.setString(4, email);
			       int a = stmt.executeUpdate();
			       System.out.println("***Customer Detail created***");	
	}
		public void PersonalCare() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into PersonalCare (Product_name,Weight,Date,Customer_id) values(?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);	             
		             System.out.println("Enter Product name:");
		             String productname =sc1.next();
		             
		             System.out.println("Enter weight:");
		             float weight = sc1.nextFloat();
		             
		             System.out.println("Enter Date:");
		             String Date = sc1.next();
		             
		             System.out.println("Enter Customer_id:");
		             int customerid =sc1.nextInt();	      
		       stmt.setString(1,productname);
		       stmt.setFloat(2,weight);
		       stmt.setString(3,Date);
		       stmt.setInt(4,customerid);
		       int a = stmt.executeUpdate();
		       System.out.println("***Order Placed***");
		
	}
	public void Vegetable() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into Vegetable (Product_name,Weight,Date,Customer_id) values(?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);
                     System.out.println("Enter Product name:");
		             String productname =sc1.next();
		             
		             System.out.println("Enter weight:");
		             float weight = sc1.nextFloat();
		        	             
		             System.out.println("Enter Date:");
		             String Date = sc1.next();
		             
		             System.out.println("Enter Customer_id:");
		             int customerid =sc1.nextInt();
		             
		            
		       stmt.setString(1,productname);
		       stmt.setFloat(2,weight);
		       stmt.setString(3,Date);
		       stmt.setInt(4,customerid);
		       int a = stmt.executeUpdate();
		       System.out.println("***Order Placed***");
		
	}
	
	public void DairyProducts() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into DairyProducts (Product_name,Weight,Date,Customer_id) values(?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter Product name:");
		             String productname =sc1.next();
		             
		             System.out.println("Enter weight:");
		             float weight = sc1.nextFloat();
		            		            		             
		             System.out.println("Enter Date:");
		             String Date = sc1.next();
		             
		             System.out.println("Enter Customer_id:");
		             int customerid =sc1.nextInt();
		             
		            
		       stmt.setString(1,productname);
		       stmt.setFloat(2,weight);
		       stmt.setString(3,Date);
		       stmt.setInt(4,customerid);
		       int a = stmt.executeUpdate();
		       System.out.println("***Order Placed***");
		
	}
	
	public void Snacks() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into Snacks (Product_name,weight,Date,Customer_id) values(?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);
		             System.out.println("Enter Product name:");
		             String productname =sc1.next();
		             
		             System.out.println("Enter Weight:");
		             float weight = sc1.nextFloat();
		             		             
		             System.out.println("Enter Date:");
		             String Date = sc1.next();
		             
		             System.out.println("Enter Customer_id:");
		             int customerid =sc1.nextInt();
		       stmt.setString(1,productname);
		       stmt.setFloat(2,weight);
		       stmt.setString(3,Date);
		       stmt.setInt(4,customerid);
		       int a = stmt.executeUpdate();
		       System.out.println("***Order Placed***");
		
	}
}