package lintcode;

import java.util.Arrays;

public class WoodCut {
	public int woodCut(int[] L, int k) {
		if (L == null || L.length == 0) return 0;
		Arrays.sort(L);
		int left = 1;
		int right = L[L.length-1];
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (getCount(L, mid) < k) {
				right = mid;
			}
			if (getCount(L, mid) >= k) {
				left = mid;
			}
		}
		if (getCount(L, right) >= k) {
			return right;
		}
		if (getCount(L, left) >= k) {
			return left;
		}
		return 0;
	}
	public int getCount(int[] L, int mid) {
		int count = 0;
		for (int i = 0; i < L.length; i++) {
			count += L[i] / mid ;
		}
		return count;
	}
}
