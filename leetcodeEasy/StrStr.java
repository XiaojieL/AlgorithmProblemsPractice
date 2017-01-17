package leetcodeEasy;

public class StrStr {
	public int strStr(String hayStack, String needle) {
		if (needle.length() > hayStack.length() || 
				hayStack == null || hayStack.length() == 0) {
			return -1;
		}
		for (int i = 0; i < hayStack.length() - needle.length() + 1 ; i++) {
			int j = 0;
			for (j = 0; j < needle.length(); j++) {
				if (hayStack.charAt(i+j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == needle.length()) return i;
		}
		return -1;
	}
}
