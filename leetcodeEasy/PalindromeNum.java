package leetcodeEasy;

//#9, check half of the reversed number, see if it matches the other half
//Useful method for reverse number
public class PalindromeNum {
	public boolean isPalindrome(int x) {
		//negative number is not palindrome, 
		//any non-zero number ends in 0 is not palindrome
		if (x < 0 || (x != 0 && x%10 == 0)) return false;
		int reverse = 0;
		while (x > reverse) {
			reverse = reverse*10 + x%10;
			x /= 10;
		}
		//if its 1221, then reverse == x;
		//if its 121, since the condition to get out of while loop above is x <= reverse,
		//thus checking if x == reverse/10;
		return (reverse == x || x == reverse/10);
	}


}
