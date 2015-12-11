package spiralArrayProgram;

public class spiralArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 5;
		
		
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
		int count, max;
		int [][] array;

		if (m >= 1 && n >= 1) {
	
			count = 1;
			max = m * n;
			array = new int[m][n];
			
			int minM = 0;
			int maxM = m-1;
			
			int minN = 0;			
			int maxN = n-1;
			
			while (count <= max) {
				
				for (int right = minN; right <= maxN; right++) {
					array[minM][right] = count++;
					//System.out.println(count++ + " " + minM + "," + right);
				}
				minM +=1;
				for (int down = minM; down <= maxM; down++) {
					array[down][maxN] = count++;
					//System.out.println(count++ + " " + down + "," + maxN);
				}
				maxN -= 1;
				for (int left = maxN; left >= minN; left--) {
					array[maxM][left] = count++;
					//System.out.println(count++ + " " + maxM + "," + left);
				}
				maxM -= 1;
				for (int up = maxM; up >= minM; up--) {
					array[up][minN] = count++;
					//System.out.println(count++ + " " + up + "," + minN);
				}
				minN += 1;
			}
			
			
			
		} else {
			array = new int[1][1];
		}

		return array;
	}
	
	private void printArray(int[][] a, int m, int n) {
		for (int i=0; i< m; i++) {
			System.out.println();
			for(int j=0; j<n; j++) {
				if (j == 0) {
					//System.out.print(i + "," + j + " ");
				} else {
					//System.out.print(i + "," + j + " ");
				}
			}
		}
		
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


