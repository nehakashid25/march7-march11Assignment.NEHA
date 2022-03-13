package march10_error_handling;

import java.util.Scanner;

public class march10_finally_catch {
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Entere values");
	        int n=scan.nextInt();
	        int b=scan.nextInt();
	        int result ;
	        try
	        {
	        System.out.println(result= n/b);
	        }
	        catch(Exception ex) 
	        {
	        System.out.println(ex.getMessage());
	       
	        }
	        finally 
	        {
	         System.out.println("Hello");
	        }
	}

}
