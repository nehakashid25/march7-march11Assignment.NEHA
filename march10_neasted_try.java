package march10_error_handling;

public class march10_neasted_try {
	public static void main(String args[])
	{
		int arr[] = { 0,1,2,3,4,5,6};
		try{
			int index1 = 7;
			int index2 = 0;
			try
			{
				System.out.print(arr[index1]/ arr[index2]);
			}
			catch(ArithmeticException ex)
			{
				System.out.println(ex.getMessage());
				System.out.println(ex.toString());
			}
		}
		catch( Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		System.out.println("hello");
		}

}
