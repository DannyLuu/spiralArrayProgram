package spiralArrayProgram;

/**
 * Practice question on creating a spiral array. Breaking the algorithm into 4
 * parts with 4 end points.
 * 
 * @author Hisoka
 *
 */
public class spiralArrayProgram {
	
	/**
	 * Main Function to call when creating the Spiral Array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		spiralArrayProgram sap = new spiralArrayProgram();
		int[][] array = sap.createArray(10, 10);

		sap.printArray(array, 10, 10);
	}
	
	private int m;
	private int n;
	private int max;
	private int[][] array;

	int count = 1;

	// Default - The array will be constructed as an 10x10 array.
	public spiralArrayProgram() {
		 m = 10;
		 n = 10;
		 max = m * n;
		 array = new int[m][n];
	}
	
	public spiralArrayProgram(int m, int n) {
		 this.m = m;
		 this.n = n;
		 this.max = m * n;
		 array = new int[m][n];
	}

	/**
	 * Creates a MxN array.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	private int[][] createArray(int m, int n) {
		int minM = 0;
		int maxM = m - 1;
		int minN = 0;
		int maxN = n - 1;

		while (count <= max) {
			spiralRight(minN, maxN, minM);
			minM += 1;
			spiralDown(maxN, minM, maxM);
			maxN -= 1;
			spiralLeft(minN, maxN, maxM);
			maxM -= 1;
			spiralUp(minN, minM, maxM);
			minN += 1;
		}

		return array;
	}

	private void spiralRight(int minN, int maxN, int minM) {
		for (int right = minN; right <= maxN; right++) {
			array[minM][right] = count++;
		}

	}

	private void spiralDown(int maxN, int minM, int maxM) {
		for (int down = minM; down <= maxM; down++) {
			array[down][maxN] = count++;
		}
	}

	private void spiralLeft(int minN, int maxN, int maxM) {
		for (int left = maxN; left >= minN; left--) {
			array[maxM][left] = count++;
		}
	}

	private void spiralUp(int minN, int minM, int maxM) {
		for (int up = maxM; up >= minM; up--) {
			array[up][minN] = count++;
		}
	}

	/***
	 * Prints a 2-d
	 * @param a
	 * @param m
	 * @param n
	 */
	private void printArray(int[][] a, int m, int n) {
		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
		}
	}
}
