package leetcodeMedium;
import java.util.*;

public class WordBreakII {
	public List<String> wordBreak(String s, List<String> wordDict) {
		return dfs(s, wordDict, new HashMap<String, ArrayList<String>>());
	}
	
	private List<String> dfs(String s, List<String> wordDict, HashMap<String, ArrayList<String>>map){
		if (map.containsKey(s)) {
			return map.get(s);
		}
		ArrayList<String> res = new ArrayList<>();
		if (s.length() == 0) {
			res.add("");
			return res;
		}
		for (String word : wordDict) {
			if (s.startsWith(word)) {
				List<String> subList = dfs(s.substring(word.length()), wordDict, map);
				for (String sub : subList) {
					res.add(word + (subList.isEmpty()? "" : " ") + sub);
				}
			}
		}
		map.put(s, res);
		return res;
	}
	public static void main(String[] args){
		System.out.println(4&3);
	}

}
