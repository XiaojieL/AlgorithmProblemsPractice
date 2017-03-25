package leetcodeMedium;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			sign = -1;
		}
		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);
		if (ldivisor == 0) return Integer.MAX_VALUE;
		if (ldividend < ldivisor || ldividend == 0) return 0;
		long lans = ldivide(ldividend, ldivisor);
		int ans = 0;
		if (lans > Integer.MAX_VALUE) {
			ans = sign > 0 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
		} else {
			ans = (int) (sign * lans);
		}
		return ans;
	}
	private long ldivide(long a, long b) {
		if (a < b) return 0;
		long sum = b;
		long res = 1;
		while ((sum+sum) <= a) {
			sum += sum;
			res += res;
		}
		return res + ldivide(a-sum, b);
 	}
}
