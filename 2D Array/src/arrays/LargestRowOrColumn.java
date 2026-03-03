package arrays;

import java.util.Scanner;

public class LargestRowOrColumn {
	
public static void main(String[] args) {
		
		int Arr[][] = takeInput();
		
		print(Arr);
		
		largestColumn(Arr);
		
	}
	
	public static int[][] takeInput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int col = sc.nextInt();
		
		
		int Arr[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print("Enter the input for Arr[" +i+"][" +j+"]: ");
				Arr[i][j] = sc.nextInt();
			}
		}
		
		
		
		sc.close();
		return Arr;
	}
	
	public static void print(int [][]Arr) {
		for(int []i: Arr) {
			for(int j: i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	
	public static void largestColumn(int [][]Arr) {
		
		int largest = Integer.MIN_VALUE;
		
		for(int col = 0; col < Arr[0].length; col++) {
			int sum = 0;
			for(int row = 0; row < Arr.length; row++) {
				sum += Arr[row][col];
			}
			if(largest < sum) {
				largest = sum;
			}
		}
		
		System.out.println("Sum of Largest Column is: " +largest);
	}

}
