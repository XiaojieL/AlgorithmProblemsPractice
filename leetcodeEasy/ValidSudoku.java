package leetcodeEasy;

import java.util.HashSet;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board.length != 9 || board[0].length != 9) {
			return false;
		}
		for (int i = 0; i < board.length; i++) {
			HashSet<Character> row = new HashSet<>();
			HashSet<Character> col = new HashSet<>();
			HashSet<Character> cubic = new HashSet<>();
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.' && !row.add(board[i][j])) {
					return false;
				}
				if (board[j][i] != '.' && !col.add(board[j][i])) {
					return false;
				}
				int rowIndex = 3*(i/3) + j/3;
				int colIndex = 3*(i%3) + j%3;
				if (board[rowIndex][colIndex] != '.' && !cubic.add(board[rowIndex][colIndex])){
					return false;
				}
			}
		}
		return true;
	}
}
