package leetcodeEasy;
//#66
public class PlusOne {
	public int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0) return digits;
		int add = 1;
		int carry = 0;
		for (int i = digits.length-1; i >= 0; i--) {
			int sum = digits[i] + add + carry;
			digits[i] = sum % 10;
			carry = sum / 10;
			add = 0;
		}
		if(carry <= 0) {
		    return digits;  
		    
		} else {
		    int[] results = new int[digits.length+1];
		    results[0] = 1;
		    for (int i = 1; i < results.length; i++) {
		        results[i] = digits[i-1];
		    }
		    return results;
		}     
	}
}
