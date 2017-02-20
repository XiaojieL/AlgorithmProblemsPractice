package leetcodeEasy;
//#492
public class ConstructRectangle {
	public int[] constructRectangle(int area) {
		int[] result = new int[2];
		if (area <= 0) {
			return result;
		}
		int w = (int) Math.sqrt(area);
		//starting from the (int) of sqrt(area), if it's
		//not fully dividable by area, reduce the number by 1
		while(area % w != 0) {
			w--;
		}
		result[0] = area/w;
		result[1] = w;
		return result;
	}
	public static void main(String[] args) {
		System.out.println((int)Math.sqrt(5));
	}
}
