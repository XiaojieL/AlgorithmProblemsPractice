package leetcodeEasy;
//#125
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s.isEmpty()) return true;
		int start = 0; 
		int end = s.length()-1;
		while (start <= end) {
			if (s.charAt(start) == ' ' || !Character.isLetterOrDigit(s.charAt(start))) start++;
			else if (s.charAt(end) == ' ' || !Character.isLetterOrDigit(s.charAt(end))) end--;
			else {
			    if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
			    start++;
			    end--;
			}
		}
		return true;   
	}
}
