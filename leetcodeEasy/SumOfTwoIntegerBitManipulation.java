package leetcodeEasy;

public class SumOfTwoIntegerBitManipulation {
	public static int getSum(int a, int b) {
		if (a == 0) return b;
		if (b == 0) return a;
		while (b != 0) {
			int carry = a & b;
			System.out.println("c"+carry);
			a = a ^ b;
			System.out.println("a"+a);
			b = carry << 1;
			System.out.println("b"+b);
		}
		return a;
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		System.out.println(getSum(a, b));
	}
}
