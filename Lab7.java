//Braden Green
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		//getting user input for the number of rows and columns for the first matrix
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the number of rows for the first matirix:");
		
		int mat1_rows = key.nextInt();
		
		System.out.println("Enter the number of columns for the first matirix:");
		
		int mat1_cols = key.nextInt();
		
		//initializing the first matrix
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		for(int i = 0; i < mat1_rows; i++) {
			for(int j = 0; j < mat1_cols; j++) {
				System.out.println("Enter the value of the first matrix at position ("+i+","+j+"):");
				
				matrix1[i][j] = key.nextInt();
			}
		}
		
		//getting user input for the number of rows and columns for the second matrix
		System.out.println("Enter the number of rows for the second matirix:");
		
		int mat2_rows = key.nextInt();
		
		System.out.println("Enter the number of columns for the second matirix:");

		int mat2_cols = key.nextInt();
		//if the values do not match then it will make the user re-enter the dimensions
		while(mat1_rows != mat2_rows) {
			System.out.println("Dimesnsion mismatch! Cannot multiply the matrices! Re-enter the dimensions of the second matrix:");
			
			mat2_rows = key.nextInt();
			
		}
		
		while(mat1_cols != mat2_cols) {
			System.out.println("Dimesnsion mismatch! Cannot multiply the matrices! Re-enter the dimensions of the second matrix:");
			
			mat2_cols = key.nextInt();
			
		}
		
		//initializing the second matrix
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		for(int i = 0; i < mat2_rows; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				System.out.println("Enter the value of the second matrix at position ("+i+","+j+"):");
				
				matrix2[i][j] = key.nextInt();
			}
		}
		//initializing the result matrix
		int[][] resultMatrix = new int[mat1_rows][mat1_cols];
		
		for (int i = 0; i < mat1_rows; i++) {
            for (int j = 0; j < mat1_cols; j++) {
            	//adds the two matrices
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
		//shows the result matrix
		System.out.println("Result Matrix:");
        for (int i = 0; i < mat1_rows; i++) {
            for (int j = 0; j < mat1_cols; j++) {
            	System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
		
		
		
		
		
		
		
		
		

	}

}
