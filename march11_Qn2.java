package march11_exception_handling;

public class march11_Qn2 {
	public static void main(String args[])
	{
		byte num;
		try
		{
			System.out.println("Scientech");
			num = Byte.parseByte("Easy");
			System.out.println("num "+num);
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}
	}

}
