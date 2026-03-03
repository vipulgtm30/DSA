package arrays;

import java.util.Scanner;

public class SetMatrixZeros {

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

	public static void setZeros(int matrix[][]) {

	        for(int row = 0; row < matrix.length; row++){
	            for(int col = 0; col < matrix[0].length; col++){
	                if(matrix[row][col] == 0){
	                	
	                	//make all top side elements zero
	                	for(int i = row-1; i >= 0; i--) {
	                		matrix[i][col] = 0;
	                	}
	                		
	                	//make all bottom side elements zero
	                	for(int i = row+1; i < matrix.length; i++) {
	                		matrix[i][col] = 0;
	                	}
	                		
	                		
	                	//make all right side elements zero
	                	for(int j = col+1; j<matrix[0].length; j++) {
	                		matrix[row][j] = 0;
	                	}
	                		
	                	//make all left side elements zero
	                	for(int j = col-1; j >= 0; j--) {
	                		matrix[row][j] = 0;
	                	}
	                    
	                }
	            }
	        }

	}

}
