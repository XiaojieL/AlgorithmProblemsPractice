package leetcodeEasy;
//#374
public class GuessNumHigherOrLower {
	public int guessNumber(int n) {
		int s = 1, e = n, m = 0;
		while (s < e) {
			m = s + (e-s)/2;
			if (guess(m) == 0) {
				return m;
			} else if (guess(m) == 1) {
				s = m+1;
			} else {
				e = m-1;
			}
		}
		return s;
	}
}
