package march10_error_handling;

public class march10_throw {
	public static void main(String args[])
	{
		int arr[] = { 0,1,2,3,4,5,6};
		int index1 = 7;
		int index2 = 0;
		try
		{
			if(index1>6)
			{
				throw new RuntimeException("index out of bound");
			}
			else
			{
				System.out.println(index1/index2);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		System.out.println("hello...");
	}


}
