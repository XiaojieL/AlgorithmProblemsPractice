package leetcodeEasy;

public class ArrangingCoins {
	public static int arrangeCoins(int n) {
		long nLong = (long) n;
		long start = 0;
		long end = nLong;
		long mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			System.out.println("m" + mid);
			if (mid * (mid + 1) <= 2 * nLong) {
				start = mid + 1;
				System.out.println("s" + start);
			} else {
				end = mid - 1;
				System.out.println("e" + end);
			}
		}
		return (int) (start - 1);
	}
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(arrangeCoins(n));
	}
}
