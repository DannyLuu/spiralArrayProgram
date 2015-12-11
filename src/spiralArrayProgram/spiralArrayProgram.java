package spiralArrayProgram;

/**
 * Practice question on creating a spiral array.
 * @author Hisoka
 *
 */
public class spiralArrayProgram {

	// The array will be constructed as an MxN array.
	public spiralArrayProgram() {
		
	}
	public static int m = 10;
	public static int n = 10;	
	public static int max = m * n;
	private int [][] array = new int[m][n];
	
	int count = 1;

	/**
	 * Main Function to call when creating the Spiral Array.
	 * @param args
	 */
	public static void main(String[] args) {
		spiralArrayProgram sap = new spiralArrayProgram();
		int [][] array = sap.createArray(m, n);
		
		sap.printArray(array, m, n);
	}
	
	/**
	 * Creates a MxN array.
	 * @param m
	 * @param n
	 * @return
	 */
	private int[][] createArray(int m, int n) {
		int minM = 0;
		int maxM = m-1;
		int minN = 0;			
		int maxN = n-1;
		
		while (count <= max) {	
			spiralRight(minN, maxN, minM);
			minM +=1;
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
	
	private void printArray(int[][] a, int m, int n) {		
		for (int i=0; i< m; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				if (j == 0) {
					System.out.print(a[i][j] + " ");
				} else {
					System.out.print(a[i][j] + " ");
				}
			}
		}
	}	
}


