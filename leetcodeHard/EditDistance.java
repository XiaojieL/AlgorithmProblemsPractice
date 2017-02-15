package leetcodeHard;

public class EditDistance {
	public static int editDistance (String s1, String s2) {
		if (s1 == null && s2 == null) return 0;
		if (s1 == null || s1.length() == 0) return s2.length();
		if (s2 == null || s2.length() == 0) return s1.length();
		int[][] matrix = new int[s2.length()+1][s1.length()+1];
		
		for (int i = 0; i <= s2.length(); i++) {
			matrix[i][0] = i;
			for (int j = 0; j <= s1.length(); j++) {
				matrix[0][j] = j; 
			}
		}
		
		for (int i = 1; i <= s2.length(); i++) {
			for (int j = 1; j <= s1.length(); j++) {
				int above = 0;
				if (s1.charAt(j-1) == s2.charAt(i-1)) {
					above = 0;
				} else {
					above += 1;
				}
				matrix[i][j] = Math.min(matrix[i-1][j-1]+above, Math.min(matrix[i-1][j] + 1, matrix[i][j-1] + 1));
			}
		}
		return matrix[s2.length()][s1.length()];
	}
	public static void main(String[] args){
		String s1 = "similarity";
		String s2 = "familiar";
		System.out.println(editDistance(s1, s2));
	}
}
