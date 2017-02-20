package leetcodeEasy;

//#461
public class HammingDistance {
	public int hammingDistance(int x, int y) {
		// ^ copies a bit if it's in one operand but not in both
		// using ^ gets us all the differences between x and y
		//Integer.bitCount returns the number of one-bits
		int result = Integer.bitCount(x ^ y);
		return result;
	}
}
