package leetcodeMedium;

import java.util.*;

//#17
public class LetterCombinationsOfPhoneNumber {

	
	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<>();
		if (digits == null || digits.length() == 0) return res;
		res.add("");
		String[] mapping = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		for (int i = 0; i < digits.length(); i++) {
			List<String> newRes = new ArrayList<>();
			//to convert a char '1' to int, use '1'-'0'
			char[] charArray = mapping[digits.charAt(i)-'0'].toCharArray();
			for (String s : res) {
				for (char c : charArray) {
					newRes.add(new String(s+c));
				}
			}
			res = newRes;
		}
		return res;
		
	}

}
