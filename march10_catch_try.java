package march10_error_handling;

public class march10_catch_try {
	public static void main(String args[])
	{
		int arr[] = { 0,1,2,3,4,5,6};
		int index1 = 6;
		int index2 = 0;
		try
		{
			System.out.print(arr[index1]/ arr[index2]);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
		System.out.println("hello geekster");
	}

}
