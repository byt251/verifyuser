import java.util.Scanner;
import java.lang.String;
public class verifyuser{
	public static void main (String[]args){

	Scanner keyboard=new Scanner(System.in);
	String username,password;

	System.out.println("Enter your username");
	username=keyboard.nextLine();

	System.out.println("Enter your password");
	password=keyboard.nextLine();

	if(username.equals("Bethlehem") && password.equals("bethcsc200")){
	System.out.println("Welcome Bethlehem");}

	else{ 
		System.out.println("Wrong username or password");}
	
	
	}

}
