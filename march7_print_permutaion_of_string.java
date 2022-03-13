package march7_String_practice;

import java.util.Scanner;

public class march7_print_permutaion_of_string {
	 static void printPermutn(String str, String ans)
	    {
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	 
	        for (int i = 0; i < str.length(); i++) {
	 
	            char ch = str.charAt(i);
	            String ros = str.substring(0, i) + str.substring(i + 1);
	            printPermutn(ros, ans + ch);
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	    	Scanner scan = new Scanner(System.in);
			
			System.out.println("enter the string");
			String s = scan.nextLine();
	        printPermutn(s, "");
	    }

}
