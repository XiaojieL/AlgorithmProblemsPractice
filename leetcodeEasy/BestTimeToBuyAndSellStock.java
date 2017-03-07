package leetcodeEasy;
//#121
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) return 0;
		int curMax = 0;
		int maxSoFar = 0;
		for (int i = 1; i < prices.length; i++) {
			curMax = Math.max(0, curMax+=prices[i]-prices[i-1]);
			maxSoFar = Math.max(curMax, maxSoFar);
		}
		return maxSoFar;
	}
}
