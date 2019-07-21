package myfirstjava;

import java.util.Scanner;

public class myfirstjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      	Scanner scann = new Scanner (System.in);
      	
      	
      	System.out.println("Enter your First name");
      	String firstName= scann.nextLine();
      	
      	System.out.println("Enter your last Name");
      	String lastName= scann.nextLine();
      	
      	System.out.println("Your email address");
      	String Emailaddress= scann.nextLine();
      	
      	System.out.println(" Create Optum ID");
      	double OptumID= scann.nextDouble();
      	
      	
      	System.out.println("First , LastName: "+firstName +","+lastName );
      	System.out.println("Emailadress: "+Emailaddress);
      	System.out.println("optumID: "+OptumID );
      	
      	
      
		
	
	 	
      	
      	
      	
      	
	}
	

}
