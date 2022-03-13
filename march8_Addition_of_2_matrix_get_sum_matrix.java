package march8_2D_array;

import java.util.Scanner;

public class march8_Addition_of_2_matrix_get_sum_matrix {
	
	public static void fill2Darray1(int arr[][], int r , int c)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 1st array element");
		for(int i=0; i<r; i++)							 
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
	}
	public static void displayarray1(int arr[][], int r , int c)
	{
		for(int i=0; i<r; i++)							//this is displaying array
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void fill2Darray2(int arr1[][], int r , int c) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 2nd array element");
		for(int i=0; i<r; i++)							 
		{
			for(int j=0;j<c;j++)
			{
				arr1[i][j] = scan.nextInt();
			}
		}
	}
	public static void displayarray2(int arr[][], int r , int c)
	{
		for(int i=0; i<r; i++)							//this is displaying array
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
				 	
			}
			System.out.println();
		}
	}
public static void SumOfArray(int arr[][],int arr1[][], int r , int c,int sumArr[][]) {
		System.out.println("enter the addition of two arrays");
		for(int i=0; i<r; i++)							 
		{
			for(int j=0;j<c;j++)
			{
				sumArr[i][j] = arr[i][j]+ arr1[i][j];
				System.out.print(sumArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of row");
		int r= scan.nextInt();
		System.out.println("enter the size of colomn");
		int c= scan.nextInt();
		 
		int[][] arr = new int[r][c];
		int[][] arr1 = new int[r][c];
		int[][] sumArr = new int[r][c];
		fill2Darray1(arr,r,c);
		displayarray1(arr,r,c);
		fill2Darray2(arr1,r,c);
		displayarray2(arr1,r,c);
		SumOfArray(arr, arr1, r,c,sumArr);
	}
}



