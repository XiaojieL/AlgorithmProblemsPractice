package leetcodeEasy;

import java.util.*;

public class Combinations {
	public static void printCombination(List<List<String>> input) {
	  List<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		if (input == null || input.size() == 0) {
			System.out.println("Invalid input.");
			return;
		}
		List<String> sub = new ArrayList<>();
		helper(input, sub, result);
		return;
	}
	
	private static void helper(List<List<String>> input,
			List<String> sub, List<ArrayList<String>> result) {
		if (sub.size() == input.size()) {
			result.add((ArrayList<String>) sub);
			System.out.println(result.get(0));
//			for (String s: sub) {
//				System.out.print(s + " ");
//			}
			return;
		}
		for (String s : input.get(sub.size())) {
			sub.add(s);
			helper(input, sub, result);
			sub.remove(sub.size()-1);
		}
	}
	 @SuppressWarnings("null")
	public static void main(String[] args) {
	    ArrayList<String> strings1 = new ArrayList<String>();
	    strings1.add("apple");
	    strings1.add("bee");
	    strings1.add("cool");
	    
	    ArrayList<String> strings2 = new ArrayList<String>();
	    strings2.add("egg");
	    strings2.add("food");
	    
	    List<List<String>> input = new ArrayList<List<String>>();
	    input.add(strings1);
	    input.add(strings2);
	    printCombination(input);
	    
	    
//	     strings.add("Hello, World!");
//	     strings.add("Welcome to CoderPad.");
//	     strings.add("This pad is running Java 8.");

//	     for (String string : strings) {
//	       System.out.println(string);
//	     }
	  }
}
