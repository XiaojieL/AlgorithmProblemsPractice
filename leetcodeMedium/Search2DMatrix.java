package leetcodeMedium;
//#74
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
		int row = matrix.length;
		int col = matrix[0].length;
		int s = 0, e = row*col - 1;
		while (s + 1 < e) {
			int m = s + (e-s) / 2;
			if (matrix[m/col][m%col] == target) return true;
			else if (matrix[m/col][m%col] > target) e = m;
			else s = m;
		}
		if (matrix[s/col][s%col] == target) return true;
		if (matrix[e/col][e%col] == target) return true;
		return false;
	}
}
