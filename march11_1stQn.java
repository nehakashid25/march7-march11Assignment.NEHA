package march11_exception_handling;

public class march11_1stQn {
	public static void main(String args[])
	{
		int x =10;
		int y=0;
		try
		{
			int z =x/y;
			System.out.print(z);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
	}

}
