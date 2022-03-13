package march7_String_practice;

public class march7_swap_2_string_without_temp {
	  public static void main(String args[]) {  
	        String a = "Am";  
	        String b = "I";  
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("\nAfter : " + a + " " + b);  
	    }  

}
