package march9_2D_array_practice;

import java.util.Scanner;

public class march9_print_lower_traingular_matrix {
	public static void main(String arg[])
	 {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of row");
		int r= scan.nextInt();
		System.out.println("enter the size of colomn");
		int c= scan.nextInt();
		 
		int[][] arr = new int[r][c];
		System.out.println("enter the 1st array element");
		for(int i=0; i<r; i++)							 
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		} 
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{ 
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	
		System.out.println("lower triangular matrix");
		 for(int i=0; i<r; i++)
			{
				for(int j=0; j<c; j++)
				{
					if( j<=i)
					{
						System.out.print(arr[i][j]+" ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		 }


}
