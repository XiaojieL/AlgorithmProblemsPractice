package leetcodeEasy;
/*
 * #172 Trailing Zero means how many zero following non-zero in a num
   eg. 120 has 1 trailing zero, 1200 has two
 *The number of trailing zeros in the decimal representation of n!, 
  the factorial of a non-negative integer n, is simply the multiplicity of
  the prime factor 5 in n!. This can be determined with this special case 
  of de Polignac's formula
*/

//check how many 5 appears in the n!
public class TrailingZero {
	public int trailingZero(int n) {
		int count = 0;
		while (n > 0) {
			n /= 5;
			count += n;
		}
		return count;
	}
}
