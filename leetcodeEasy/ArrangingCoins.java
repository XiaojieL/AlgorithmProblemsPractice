package leetcodeEasy;
//#441
//this question is basically finding x in 1+2+..+x <= n
//mid*(mid+1)/2 => calculates the sum of numbers from 1 to mid
//binary search, time complexity is log(n)

public class ArrangingCoins {
	public static int arrangeCoins(int n) {
		long nLong = (long) n;
		long start = 0;
		long end = nLong;
		long mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (mid * (mid + 1) <= 2 * nLong) {
				start = mid+1;
			} else {
				end = mid-1 ;
			}
		}
		return (int) (start-1);
	}
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(arrangeCoins(n));
	}
}
