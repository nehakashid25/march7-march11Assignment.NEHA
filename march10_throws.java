package march10_error_handling;

public class march10_throws {
	void method1() throws ArithmeticException{  
		   throw new ArithmeticException("Calculation error"); 
    }  
    void method2() throws ArithmeticException{  
  method1();  
    }  
    void method3(){  
  try{  
     method2();  
  }
  catch(ArithmeticException e){
     System.out.println("ArithmeticException handled");
  }  
    }  
    public static void main(String args[]){  
    	march10_throws obj=new march10_throws();  
  obj.method3();  
  System.out.println("End Of Program"); 
    }
    

}
