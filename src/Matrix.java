//FIXME
public class Matrix {

	public int[][] transpose(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int[][] transposed = new int[m][n];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				transposed[col][row] = matrix[row][col];
			}
		}
		return transposed;
	}
	
	public double dot(double[] first, double[] second) {
		if (first.length != second.length) {
			throw new RuntimeException();
		}
		double result = 0;
		for (int i = 0; i < first.length; i++) {
			result = result + first[i] * second[i];
		}
		return result;
	}
	
	public double[][] mult(double[][] first, double[][] second) {
		//TODO corner cases
		double[][] result = new double[first.length][second[0].length];
		
		
		return result;
	}
	
	public double[] mult(double[][] matrix, double[] vector) {
		double[] result = new double[vector.length];
		
		
		return result;
	}
	
	public double[] mult(double[] vector, double[][] matrix) {
		double[] result = new double[vector.length];
		
		
		return result;
	}
	
	private static void print(int[][] matrix) {
		for (int[] vector : matrix) {
			for (int value : vector) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
