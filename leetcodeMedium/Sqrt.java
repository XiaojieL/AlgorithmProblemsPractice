package leetcodeMedium;

//#69, pay attention to long/int types to avoid overflow
public class Sqrt {
	public int sqrt(int x) {
		if (x < 0) return -1;
		if (x == 0) return 0;
		long left = 1;
		long right = Integer.MAX_VALUE;
		while (left + 1 < right) {
			long mid = left + (right-left)/2;
			if (mid * mid <= x) {
				left = mid;
			}
		    else {
		        right = mid;
		    }
		}
		if (right * right <= x) {
			return (int)right;
		}
		return (int)left;      
	}

}
