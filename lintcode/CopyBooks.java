package lintcode;

public class CopyBooks {
	public int copyBooks(int[] pages, int k) {
		if (pages == null || pages.length == 0) return 0;
		int total = 0;
		int maxPage = pages[0];
		for (int i = 0; i < pages.length; i++) {
			total += pages[i];
			maxPage = Math.max(maxPage, pages[i]);
		}
		int start = maxPage;
		int end = total;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (countPeople(pages, mid) > k) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (countPeople(pages, start) <= k) {
			return start;
		}
		return end;
	}
	private int countPeople(int[] pages, int limit) {
		if (pages == null || pages.length == 0) return 0;
		int people = 1;
		int sum = pages[0];
		for (int i = 1; i < pages.length; i++) {
			if (sum + pages[i] > limit) {
				people++;
				sum = 0;
			}
			sum += pages[i];
		}
		return people;
	}

}
